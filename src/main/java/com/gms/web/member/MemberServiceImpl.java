package com.gms.web.member ;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.gms.web.command.CommandDTO;
import com.gms.web.member.MemberService;
import com.gms.web.util.Separator;
@Service
public class MemberServiceImpl implements MemberService {
   MemberDTO member;
   Map<String, MemberDTO> map; // key 값은 String으로 주고 object(instance) =
                           // MemberBean이다
   List<StudentDTO> list;
   
   public static MemberServiceImpl getInstance() {
      return new MemberServiceImpl();
   }

   private MemberServiceImpl(){}
   

   @Override
   public Map<String,Object> login(MemberDTO bean) {
      System.out.println("MemberServiceImpl login entered!!!!");
      Map<String,Object> map= new HashMap<>();
      CommandDTO cmd= new CommandDTO();
      cmd.setSearch(bean.getId());
    /*   MemberDTO m = dao.login(cmd);
       String page=(m!=null)?(bean.getPw().equals(m.getPw()))?"main":"login_fail":"join";
       System.out.println("service Impl login page는????"+page);
       map.put("page", page);
       map.put("user", m);*/
      return map;
   }
   
   @Override
   public String addMember(Map<String, Object> map) {
      System.out.println("Member serviceImpl entered");
      String result="";
      MemberDTO m = (MemberDTO) map.get("member");
      System.out.println("넘어온 학생 회원정보 ==="+ m.toString());
   /*   @SuppressWarnings("unchecked")
      List<MajorDTO> list= (List<MajorDTO>) map.get("major");
      System.out.println("넘어온 과목들 !!!"+list.toString());
      result= dao.insertMember(map);
      Separator.cmd.setDir("home");
      Separator.cmd.setPage("main");
      Separator.cmd.process();*/
      return result;
   }

   @Override
   public String count(CommandDTO cmd) {
   /*   return dao.count(cmd);// memberList.length;*/
      return null;
   }

   @SuppressWarnings("unchecked")
   @Override
   public List<?> list(CommandDTO cmd) {
      /*list=(List<StudentDTO>) dao.selectAll(cmd);*/
      System.out.println("list to string servicd"+list.toString());
      return list; // ArrayList가 된다
   }

   @Override
   public StudentDTO findById(CommandDTO cmd) {
      StudentDTO stu = new StudentDTO();
      /*stu = dao.selectById(cmd);*/
      return stu;
   }

   @Override
   public List<?> findByName(CommandDTO cmd) {
      System.out.println("findByName:: "+cmd.getSearch()+"::");
   /*   return dao.selectByName(cmd);*/
      return null;
   }

   @Override
   public String modifiyProfile(MemberDTO bean) {
      String result = "";
      // findById(bean.getPw()).setPw(bean.getPw());
      CommandDTO cmd=new CommandDTO();
      cmd.setSearch(bean.getId());
      /*MemberDTO mem =dao.login(cmd);
      if (!bean.getName().equals("")) {
         mem.setName(bean.getName());
      }
      if (!bean.getPw().equals("")) {
         mem.setPw(bean.getPw());
      }
      if (!bean.getSsn().equals("")) {
         mem.setSsn(bean.getSsn());
      }
      System.out.println("serviceImpl*****" + mem);
*/      return result;
   }


   @Override
   public String removeUser(CommandDTO cmd) {
      String removeResult = "";
      for (StudentDTO m : list) {
         if (cmd.equals(m.getId())) {
            // list.get(i)=list[count-1];
            map.remove(cmd);
            break;
         }
      }
      // list.get(i)=null;
      // count--;
      return removeResult;
   }


}