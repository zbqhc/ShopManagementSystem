package logic;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;

import dao.BasicInfo;
import dao.DepartmentInfo;
import dao.DetailInfo;
import dao.JoinDepot;
import dao.PaymentInfo;
import dao.ProvideInfo;
public class JTableDefineTest extends JFrame{

    public JScrollPane testQueryAllStaff() throws Exception//查询所有员工信息
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"员工id","员工姓名","员工性别","出生日期","部门","职务"};
        Vector columnNameV = new Vector();    //获得表头
        for(int column = 0;column<columnNames.length;column++)
        {
            columnNameV.add(columnNames[column]);
        }
        Staff s =new Staff();
        List<BasicInfo> list = s.queryAllStaff();
        Vector tableValueV = new Vector();
        for(BasicInfo i:list){
        	 Vector rowV = new Vector();
        	  rowV.add(i.getId());
            rowV.add(i.getName());
            if(i.getSex()==1){
            	rowV.add("男");
            
            	}else{
            		rowV.add("女");
            	}
            
            
            rowV.add(i.getBirth());
            rowV.add(i.getDept());
            rowV.add(i.getHeadship());
            
            tableValueV.add(rowV);
        }
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //自定义的表格
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //关闭表格列的自动调整功能。
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //单选
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //支持滚动
		return scrollPane;
        
    }
    /**
     * @param args
     */
    public JScrollPane testQueryStaff(int id) throws Exception
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"员工id","员工姓名","员工性别","出生日期","部门","职务"};
        Vector columnNameV = new Vector();    //获得表头
        for(int column = 0;column<columnNames.length;column++)
        {
            columnNameV.add(columnNames[column]);
        }
        Staff s =new Staff();
        List<BasicInfo> list = s.queryStaff(id);
        Vector tableValueV = new Vector();
        for(BasicInfo i:list){
        	 Vector rowV = new Vector();
        	  rowV.add(i.getId());
            rowV.add(i.getName());
            if(i.getSex()==1){
            	rowV.add("男");
            
            	}else{
            		rowV.add("女");
            	}
            
            
            rowV.add(i.getBirth());
            rowV.add(i.getDept());
            rowV.add(i.getHeadship());
            
            tableValueV.add(rowV);
        }
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //自定义的表格
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //关闭表格列的自动调整功能。
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //单选
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //支持滚动
		return scrollPane;
        
    }
    public JScrollPane testQueryStaffMiddle(int id,int number) throws Exception//查询所有员工信息
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"员工id","员工姓名","员工性别","出生日期","部门","职务"};
        Vector columnNameV = new Vector();    //获得表头
        for(int column = 0;column<columnNames.length;column++)
        {
            columnNameV.add(columnNames[column]);
        }
        Staff s =new Staff();
        List<BasicInfo> list = s.queryStaffMiddle(id, number);
        Vector tableValueV = new Vector();
        for(BasicInfo i:list){
        	 Vector rowV = new Vector();
        	  rowV.add(i.getId());
            rowV.add(i.getName());
            if(i.getSex()==1){
            	rowV.add("男");
            
            	}else{
            		rowV.add("女");
            	}
            
            
            rowV.add(i.getBirth());
            rowV.add(i.getDept());
            rowV.add(i.getHeadship());
            
            tableValueV.add(rowV);
        }
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //自定义的表格
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //关闭表格列的自动调整功能。
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //单选
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //支持滚动
		return scrollPane;
        
    }
    public JScrollPane testQueryAllDetailStaff() throws Exception//查询所有员工信息
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"员工id","联系电话","办公电话","传真","电子邮箱","家庭地址"};
        Vector columnNameV = new Vector();    //获得表头
        for(int column = 0;column<columnNames.length;column++)
        {
            columnNameV.add(columnNames[column]);
        }
        DetailStaff s =new DetailStaff();
        List<DetailInfo> list = s.queryAllDetailStaff();
        Vector tableValueV = new Vector();
        for(DetailInfo i:list){
        	 Vector rowV = new Vector();
        	  rowV.add(i.getId());
            rowV.add(i.getContact());
            rowV.add(i.getOfficePhone());
            rowV.add(i.getFax());
            rowV.add(i.getEmail());
            rowV.add(i.getFaddress());
            
            tableValueV.add(rowV);
        }
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //自定义的表格
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //关闭表格列的自动调整功能。
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //单选
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //支持滚动
		return scrollPane;
        
    }
    public JScrollPane testQueryDetailStaff(int id) throws Exception//查询所有员工信息
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"员工id","联系电话","办公电话","传真","电子邮箱","家庭地址"};
        Vector columnNameV = new Vector();    //获得表头
        for(int column = 0;column<columnNames.length;column++)
        {
            columnNameV.add(columnNames[column]);
        }
        DetailStaff s =new DetailStaff();
        List<DetailInfo> list = s.queryDetailStaff(id);
        Vector tableValueV = new Vector();
        for(DetailInfo i:list){
        	 Vector rowV = new Vector();
        	  rowV.add(i.getId());
            rowV.add(i.getContact());
            rowV.add(i.getOfficePhone());
            rowV.add(i.getFax());
            rowV.add(i.getEmail());
            rowV.add(i.getFaddress());
            
            tableValueV.add(rowV);
        }
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //自定义的表格
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //关闭表格列的自动调整功能。
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //单选
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //支持滚动
		return scrollPane;
        
    }
    public JScrollPane testQueryDetailStaffMiddle(int id,int number) throws Exception//查询所有员工信息
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"员工id","联系电话","办公电话","传真","电子邮箱","家庭地址"};
        Vector columnNameV = new Vector();    //获得表头
        for(int column = 0;column<columnNames.length;column++)
        {
            columnNameV.add(columnNames[column]);
        }
        DetailStaff s =new DetailStaff();
        List<DetailInfo> list = s.queryDetailStaffMiddle(id, number);
        Vector tableValueV = new Vector();
        for(DetailInfo i:list){
        	 Vector rowV = new Vector();
        	  rowV.add(i.getId());
            rowV.add(i.getContact());
            rowV.add(i.getOfficePhone());
            rowV.add(i.getFax());
            rowV.add(i.getEmail());
            rowV.add(i.getFaddress());
            
            tableValueV.add(rowV);
        }
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //自定义的表格
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //关闭表格列的自动调整功能。
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //单选
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //支持滚动
		return scrollPane;
        
    }
    public JScrollPane testQueryAllStock() throws Exception//查询所有员工信息
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"货物id","订单编号","仓库编号","货物名称","入库时间","货物重量","货物数量","备注信息"};
        Vector columnNameV = new Vector();    //获得表头
        for(int column = 0;column<columnNames.length;column++)
        {
            columnNameV.add(columnNames[column]);
        }
        Stock s =new Stock();
        List<JoinDepot> list = s.queryAllStock();
        Vector tableValueV = new Vector();
        for(JoinDepot i:list){
        	 Vector rowV = new Vector();
        	  rowV.add(i.getId());
            rowV.add(i.getOid());
            rowV.add(i.getdId());
            rowV.add(i.getWareName());
            rowV.add(i.getJoinTime());
            rowV.add(i.getWeight());
            rowV.add(i.getQuantity());
            rowV.add(i.getRemark());
            tableValueV.add(rowV);
        }
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //自定义的表格
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //关闭表格列的自动调整功能。
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //单选
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //支持滚动
		return scrollPane;
        
    }
    public JScrollPane testQueryStock(int id) throws Exception//查询所有员工信息
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"货物id","订单编号","仓库编号","货物名称","入库时间","货物重量","货物数量","备注信息"};
        Vector columnNameV = new Vector();    //获得表头
        for(int column = 0;column<columnNames.length;column++)
        {
            columnNameV.add(columnNames[column]);
        }
        Stock s =new Stock();
        List<JoinDepot> list = s.queryStock(id);
        Vector tableValueV = new Vector();
        for(JoinDepot i:list){
        	 Vector rowV = new Vector();
        	  rowV.add(i.getId());
            rowV.add(i.getOid());
            rowV.add(i.getdId());
            rowV.add(i.getWareName());
            rowV.add(i.getJoinTime());
            rowV.add(i.getWeight());
            rowV.add(i.getQuantity());
            rowV.add(i.getRemark());
            tableValueV.add(rowV);
        }
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //自定义的表格
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //关闭表格列的自动调整功能。
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //单选
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //支持滚动
		return scrollPane;
        
    }
    public JScrollPane testQueryStockMiddle(int id,int number) throws Exception//查询所有员工信息
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"货物id","订单编号","仓库编号","货物名称","入库时间","货物重量","货物数量","备注信息"};
        Vector columnNameV = new Vector();    //获得表头
        for(int column = 0;column<columnNames.length;column++)
        {
            columnNameV.add(columnNames[column]);
        }
        Stock s =new Stock();
        List<JoinDepot> list = s.queryStockMiddle(id, number);
        Vector tableValueV = new Vector();
        for(JoinDepot i:list){
        	 Vector rowV = new Vector();
        	  rowV.add(i.getId());
            rowV.add(i.getOid());
            rowV.add(i.getdId());
            rowV.add(i.getWareName());
            rowV.add(i.getJoinTime());
            rowV.add(i.getWeight());
            rowV.add(i.getQuantity());
            rowV.add(i.getRemark());
            tableValueV.add(rowV);
        }
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //自定义的表格
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //关闭表格列的自动调整功能。
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //单选
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //支持滚动
		return scrollPane;
        
    }
    public JScrollPane testQueryAllSupplier() throws Exception//查询所有员工信息
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"供应商id","供应商姓名","供应商地址","联系人","联系电话","传真","邮政编码","银行账号","主页","电子邮箱地址","备注信息"};
        Vector columnNameV = new Vector();    //获得表头
        for(int column = 0;column<columnNames.length;column++)
        {
            columnNameV.add(columnNames[column]);
        }
        Supplier s =new Supplier();
        List<ProvideInfo> list = s.queryAllSupplier();
        Vector tableValueV = new Vector();
        for(ProvideInfo i:list){
        	 Vector rowV = new Vector();
        	  rowV.add(i.getId());
            rowV.add(i.getcName());
            rowV.add(i.getAddress());
            rowV.add(i.getLinkMan());
            rowV.add(i.getLinkPhone());
            rowV.add(i.getFaxes());
            rowV.add(i.getPostNum());
            rowV.add(i.getBankNum());
            rowV.add(i.getNetAddress());
            rowV.add(i.getEmailAddress());
            rowV.add(i.getRemark());
            tableValueV.add(rowV);
        }
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //自定义的表格
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //关闭表格列的自动调整功能。
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //单选
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //支持滚动
		return scrollPane;
        
    }
    public JScrollPane testQuerySupplier(int id) throws Exception//查询所有员工信息
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"供应商id","供应商姓名","供应商地址","联系人","联系电话","传真","邮政编码","银行账号","主页","电子邮箱地址","备注信息"};
        Vector columnNameV = new Vector();    //获得表头
        for(int column = 0;column<columnNames.length;column++)
        {
            columnNameV.add(columnNames[column]);
        }
        Supplier s =new Supplier();
        List<ProvideInfo> list = s.querySupplier(id);
        Vector tableValueV = new Vector();
        for(ProvideInfo i:list){
        	 Vector rowV = new Vector();
        	  rowV.add(i.getId());
            rowV.add(i.getcName());
            rowV.add(i.getAddress());
            rowV.add(i.getLinkMan());
            rowV.add(i.getLinkPhone());
            rowV.add(i.getFaxes());
            rowV.add(i.getPostNum());
            rowV.add(i.getBankNum());
            rowV.add(i.getNetAddress());
            rowV.add(i.getEmailAddress());
            rowV.add(i.getRemark());
            tableValueV.add(rowV);
        }
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //自定义的表格
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //关闭表格列的自动调整功能。
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //单选
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //支持滚动
		return scrollPane;
        
    }
    public JScrollPane testQuerySupplierMiddle(int id,int number) throws Exception//查询所有员工信息
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"供应商id","供应商姓名","供应商地址","联系人","联系电话","传真","邮政编码","银行账号","主页","电子邮箱地址","备注信息"};
        Vector columnNameV = new Vector();    //获得表头
        for(int column = 0;column<columnNames.length;column++)
        {
            columnNameV.add(columnNames[column]);
        }
        Supplier s =new Supplier();
        List<ProvideInfo> list = s.querySupplierMiddle(id, number);
        Vector tableValueV = new Vector();
        for(ProvideInfo i:list){
        	 Vector rowV = new Vector();
        	  rowV.add(i.getId());
            rowV.add(i.getcName());
            rowV.add(i.getAddress());
            rowV.add(i.getLinkMan());
            rowV.add(i.getLinkPhone());
            rowV.add(i.getFaxes());
            rowV.add(i.getPostNum());
            rowV.add(i.getBankNum());
            rowV.add(i.getNetAddress());
            rowV.add(i.getEmailAddress());
            rowV.add(i.getRemark());
            tableValueV.add(rowV);
        }
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //自定义的表格
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //关闭表格列的自动调整功能。
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //单选
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //支持滚动
		return scrollPane;
        
    }
      
    
    public JScrollPane testQueryAllCommodity() throws Exception//查询所有员工信息
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"账本id","商品id","商品名称","商品数量","商品单价","添加时间","备注信息"};
        Vector columnNameV = new Vector();    //获得表头
        for(int column = 0;column<columnNames.length;column++)
        {
            columnNameV.add(columnNames[column]);
        }
        Commodity s =new Commodity();
        List<PaymentInfo> list = s.queryAllCommodity();
        Vector tableValueV = new Vector();
        for(PaymentInfo i:list){
        	 Vector rowV = new Vector();
        	  rowV.add(i.getId());
            rowV.add(i.getSid());
            rowV.add(i.getSname());
            rowV.add(i.getsQuantity());
            rowV.add(i.getTrice()); 
            rowV.add(i.getTimeStamp());
            rowV.add(i.getRemarks());
           
           
            tableValueV.add(rowV);
        }
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //自定义的表格
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //关闭表格列的自动调整功能。
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //单选
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //支持滚动
		return scrollPane;
        
    }
    public JScrollPane testQueryDateCommodity(String date) throws Exception//查询所有员工信息
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"账本id","商品id","商品名称","商品数量","商品单价","添加时间","备注信息"};
        Vector columnNameV = new Vector();    //获得表头
        for(int column = 0;column<columnNames.length;column++)
        {
            columnNameV.add(columnNames[column]);
        }
        Commodity s =new Commodity();
        List<PaymentInfo> list = s.queryDateCommodity(date);
        Vector tableValueV = new Vector();
        for(PaymentInfo i:list){
        	 Vector rowV = new Vector();
        	  rowV.add(i.getId());
            rowV.add(i.getSid());
            rowV.add(i.getSname());
            rowV.add(i.getsQuantity());
            rowV.add(i.getTrice()); 
            rowV.add(i.getTimeStamp());
            rowV.add(i.getRemarks());
           
           
            tableValueV.add(rowV);
        }
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //自定义的表格
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //关闭表格列的自动调整功能。
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //单选
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //支持滚动
		return scrollPane;
        
    }
    public JScrollPane testQueryTypeCommodity(String type) throws Exception//查询所有员工信息
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"账本id","商品id","商品名称","商品数量","商品单价","添加时间","备注信息"};
        Vector columnNameV = new Vector();    //获得表头
        for(int column = 0;column<columnNames.length;column++)
        {
            columnNameV.add(columnNames[column]);
        }
        Commodity s =new Commodity();
        List<PaymentInfo> list = s.queryTypeCommodity(type);
        Vector tableValueV = new Vector();
        for(PaymentInfo i:list){
        	 Vector rowV = new Vector();
        	  rowV.add(i.getId());
            rowV.add(i.getSid());
            rowV.add(i.getSname());
            rowV.add(i.getsQuantity());
            rowV.add(i.getTrice()); 
            rowV.add(i.getTimeStamp());
            rowV.add(i.getRemarks());
           
           
            tableValueV.add(rowV);
        }
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //自定义的表格
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //关闭表格列的自动调整功能。
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //单选
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //支持滚动
		return scrollPane;
        
    }
    public JScrollPane testQuerySIDCommodity(int SID) throws Exception//查询所有员工信息
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"账本id","商品id","商品名称","商品数量","商品单价","添加时间","备注信息"};
        Vector columnNameV = new Vector();    //获得表头
        for(int column = 0;column<columnNames.length;column++)
        {
            columnNameV.add(columnNames[column]);
        }
        Commodity s =new Commodity();
        List<PaymentInfo> list = s.querySIDCommodity(SID);
        Vector tableValueV = new Vector();
        for(PaymentInfo i:list){
        	 Vector rowV = new Vector();
        	  rowV.add(i.getId());
            rowV.add(i.getSid());
            rowV.add(i.getSname());
            rowV.add(i.getsQuantity());
            rowV.add(i.getTrice()); 
            rowV.add(i.getTimeStamp());
            rowV.add(i.getRemarks());
           
           
            tableValueV.add(rowV);
        }
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //自定义的表格
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //关闭表格列的自动调整功能。
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //单选
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //支持滚动
		return scrollPane;
        
    }
    public JScrollPane testQueryAllDepartment() throws Exception//查询所有员工信息
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"部门id","部门名称","部门权限"};
        Vector columnNameV = new Vector();    //获得表头
        for(int column = 0;column<columnNames.length;column++)
        {
            columnNameV.add(columnNames[column]);
        }
        Department s =new Department();
        List<DepartmentInfo> list = s.queryAllDepartment();
        Vector tableValueV = new Vector();
        for(DepartmentInfo i:list){
        	 Vector rowV = new Vector();
        	  rowV.add(i.getId());
            rowV.add(i.getName());
          //  rowV.add(i.getPermitMap());
           
           
           
            tableValueV.add(rowV);
        }
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //自定义的表格
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //关闭表格列的自动调整功能。
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //单选
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //支持滚动
		return scrollPane;
        
    }
class MyTable extends JTable    //实现自定义类
{

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    public MyTable()
    {
        
    }
    public MyTable(Vector rowData ,Vector columnNames)
    {
        super(rowData,columnNames);
    }
    
    /**
     * @Override
     */
    public JTableHeader getTableHeader()
    {
        JTableHeader tableHeader = super.getTableHeader();
        tableHeader.setReorderingAllowed(false);   //设置表格列不可重排
        DefaultTableCellRenderer hr =(DefaultTableCellRenderer)tableHeader.getDefaultRenderer();  //获得表格头的单元格对象
        hr.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);  //列名居中
        return tableHeader;
        
    }
    
    /* （非 Javadoc）
	 * @see javax.swing.JTable#getDefaultRenderer(java.lang.Class)
	 */
	
	/**
     * @Override
     */
    public boolean isCellEditable(int row,int column)
    {
        return false;   //单元格不可修改
    }
}}

