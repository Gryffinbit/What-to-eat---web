package servlet.user._private;

import com.alibaba.fastjson.JSON;
import service.impl.PrivateFoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Hashtable;

@WebServlet("/menu/private/showAll")
public class ShowAllServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrivateFoodsServiceImpl pbFdServiceImpl = new PrivateFoodsServiceImpl();
        Hashtable ret = new Hashtable();
        ret.put("code", 200);
        ret.put("msg", "查询成功");
        ret.put("data", pbFdServiceImpl.getAllFoods());
        response.setContentType("application/json; charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.write(JSON.toJSONString(ret));
    }
}
