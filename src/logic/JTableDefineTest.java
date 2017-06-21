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

    public JScrollPane testQueryAllStaff() throws Exception//��ѯ����Ա����Ϣ
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"Ա��id","Ա������","Ա���Ա�","��������","����","ְ��"};
        Vector columnNameV = new Vector();    //��ñ�ͷ
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
            	rowV.add("��");
            
            	}else{
            		rowV.add("Ů");
            	}
            
            
            rowV.add(i.getBirth());
            rowV.add(i.getDept());
            rowV.add(i.getHeadship());
            
            tableValueV.add(rowV);
        }
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //�Զ���ı��
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //�رձ���е��Զ��������ܡ�
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //��ѡ
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //֧�ֹ���
		return scrollPane;
        
    }
    /**
     * @param args
     */
    public JScrollPane testQueryStaff(int id) throws Exception
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"Ա��id","Ա������","Ա���Ա�","��������","����","ְ��"};
        Vector columnNameV = new Vector();    //��ñ�ͷ
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
            	rowV.add("��");
            
            	}else{
            		rowV.add("Ů");
            	}
            
            
            rowV.add(i.getBirth());
            rowV.add(i.getDept());
            rowV.add(i.getHeadship());
            
            tableValueV.add(rowV);
        }
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //�Զ���ı��
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //�رձ���е��Զ��������ܡ�
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //��ѡ
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //֧�ֹ���
		return scrollPane;
        
    }
    public JScrollPane testQueryStaffMiddle(int id,int number) throws Exception//��ѯ����Ա����Ϣ
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"Ա��id","Ա������","Ա���Ա�","��������","����","ְ��"};
        Vector columnNameV = new Vector();    //��ñ�ͷ
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
            	rowV.add("��");
            
            	}else{
            		rowV.add("Ů");
            	}
            
            
            rowV.add(i.getBirth());
            rowV.add(i.getDept());
            rowV.add(i.getHeadship());
            
            tableValueV.add(rowV);
        }
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //�Զ���ı��
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //�رձ���е��Զ��������ܡ�
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //��ѡ
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //֧�ֹ���
		return scrollPane;
        
    }
    public JScrollPane testQueryAllDetailStaff() throws Exception//��ѯ����Ա����Ϣ
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"Ա��id","��ϵ�绰","�칫�绰","����","��������","��ͥ��ַ"};
        Vector columnNameV = new Vector();    //��ñ�ͷ
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
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //�Զ���ı��
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //�رձ���е��Զ��������ܡ�
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //��ѡ
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //֧�ֹ���
		return scrollPane;
        
    }
    public JScrollPane testQueryDetailStaff(int id) throws Exception//��ѯ����Ա����Ϣ
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"Ա��id","��ϵ�绰","�칫�绰","����","��������","��ͥ��ַ"};
        Vector columnNameV = new Vector();    //��ñ�ͷ
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
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //�Զ���ı��
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //�رձ���е��Զ��������ܡ�
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //��ѡ
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //֧�ֹ���
		return scrollPane;
        
    }
    public JScrollPane testQueryDetailStaffMiddle(int id,int number) throws Exception//��ѯ����Ա����Ϣ
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"Ա��id","��ϵ�绰","�칫�绰","����","��������","��ͥ��ַ"};
        Vector columnNameV = new Vector();    //��ñ�ͷ
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
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //�Զ���ı��
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //�رձ���е��Զ��������ܡ�
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //��ѡ
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //֧�ֹ���
		return scrollPane;
        
    }
    public JScrollPane testQueryAllStock() throws Exception//��ѯ����Ա����Ϣ
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"����id","�������","�ֿ���","��������","���ʱ��","��������","��������","��ע��Ϣ"};
        Vector columnNameV = new Vector();    //��ñ�ͷ
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
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //�Զ���ı��
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //�رձ���е��Զ��������ܡ�
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //��ѡ
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //֧�ֹ���
		return scrollPane;
        
    }
    public JScrollPane testQueryStock(int id) throws Exception//��ѯ����Ա����Ϣ
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"����id","�������","�ֿ���","��������","���ʱ��","��������","��������","��ע��Ϣ"};
        Vector columnNameV = new Vector();    //��ñ�ͷ
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
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //�Զ���ı��
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //�رձ���е��Զ��������ܡ�
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //��ѡ
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //֧�ֹ���
		return scrollPane;
        
    }
    public JScrollPane testQueryStockMiddle(int id,int number) throws Exception//��ѯ����Ա����Ϣ
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"����id","�������","�ֿ���","��������","���ʱ��","��������","��������","��ע��Ϣ"};
        Vector columnNameV = new Vector();    //��ñ�ͷ
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
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //�Զ���ı��
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //�رձ���е��Զ��������ܡ�
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //��ѡ
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //֧�ֹ���
		return scrollPane;
        
    }
    public JScrollPane testQueryAllSupplier() throws Exception//��ѯ����Ա����Ϣ
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"��Ӧ��id","��Ӧ������","��Ӧ�̵�ַ","��ϵ��","��ϵ�绰","����","��������","�����˺�","��ҳ","���������ַ","��ע��Ϣ"};
        Vector columnNameV = new Vector();    //��ñ�ͷ
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
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //�Զ���ı��
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //�رձ���е��Զ��������ܡ�
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //��ѡ
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //֧�ֹ���
		return scrollPane;
        
    }
    public JScrollPane testQuerySupplier(int id) throws Exception//��ѯ����Ա����Ϣ
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"��Ӧ��id","��Ӧ������","��Ӧ�̵�ַ","��ϵ��","��ϵ�绰","����","��������","�����˺�","��ҳ","���������ַ","��ע��Ϣ"};
        Vector columnNameV = new Vector();    //��ñ�ͷ
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
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //�Զ���ı��
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //�رձ���е��Զ��������ܡ�
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //��ѡ
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //֧�ֹ���
		return scrollPane;
        
    }
    public JScrollPane testQuerySupplierMiddle(int id,int number) throws Exception//��ѯ����Ա����Ϣ
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"��Ӧ��id","��Ӧ������","��Ӧ�̵�ַ","��ϵ��","��ϵ�绰","����","��������","�����˺�","��ҳ","���������ַ","��ע��Ϣ"};
        Vector columnNameV = new Vector();    //��ñ�ͷ
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
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //�Զ���ı��
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //�رձ���е��Զ��������ܡ�
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //��ѡ
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //֧�ֹ���
		return scrollPane;
        
    }
      
    
    public JScrollPane testQueryAllCommodity() throws Exception//��ѯ����Ա����Ϣ
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"�˱�id","��Ʒid","��Ʒ����","��Ʒ����","��Ʒ����","���ʱ��","��ע��Ϣ"};
        Vector columnNameV = new Vector();    //��ñ�ͷ
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
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //�Զ���ı��
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //�رձ���е��Զ��������ܡ�
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //��ѡ
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //֧�ֹ���
		return scrollPane;
        
    }
    public JScrollPane testQueryDateCommodity(String date) throws Exception//��ѯ����Ա����Ϣ
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"�˱�id","��Ʒid","��Ʒ����","��Ʒ����","��Ʒ����","���ʱ��","��ע��Ϣ"};
        Vector columnNameV = new Vector();    //��ñ�ͷ
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
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //�Զ���ı��
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //�رձ���е��Զ��������ܡ�
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //��ѡ
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //֧�ֹ���
		return scrollPane;
        
    }
    public JScrollPane testQueryTypeCommodity(String type) throws Exception//��ѯ����Ա����Ϣ
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"�˱�id","��Ʒid","��Ʒ����","��Ʒ����","��Ʒ����","���ʱ��","��ע��Ϣ"};
        Vector columnNameV = new Vector();    //��ñ�ͷ
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
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //�Զ���ı��
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //�رձ���е��Զ��������ܡ�
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //��ѡ
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //֧�ֹ���
		return scrollPane;
        
    }
    public JScrollPane testQuerySIDCommodity(int SID) throws Exception//��ѯ����Ա����Ϣ
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"�˱�id","��Ʒid","��Ʒ����","��Ʒ����","��Ʒ����","���ʱ��","��ע��Ϣ"};
        Vector columnNameV = new Vector();    //��ñ�ͷ
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
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //�Զ���ı��
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //�رձ���е��Զ��������ܡ�
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //��ѡ
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //֧�ֹ���
		return scrollPane;
        
    }
    public JScrollPane testQueryAllDepartment() throws Exception//��ѯ����Ա����Ϣ
    {
      
       
        JScrollPane scrollPane = new JScrollPane();  
        String[] columnNames = {"����id","��������","����Ȩ��"};
        Vector columnNameV = new Vector();    //��ñ�ͷ
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
        
      
        JTable table = new MyTable(tableValueV,columnNameV);   //�Զ���ı��
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  //�رձ���е��Զ��������ܡ�
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);   //��ѡ
        table.setSelectionBackground(Color.BLUE);
        table.setSelectionForeground(Color.WHITE);
        table.setRowHeight(30);
        scrollPane.setViewportView(table);   //֧�ֹ���
		return scrollPane;
        
    }
class MyTable extends JTable    //ʵ���Զ�����
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
        tableHeader.setReorderingAllowed(false);   //���ñ���в�������
        DefaultTableCellRenderer hr =(DefaultTableCellRenderer)tableHeader.getDefaultRenderer();  //��ñ��ͷ�ĵ�Ԫ�����
        hr.setHorizontalAlignment(DefaultTableCellRenderer.CENTER);  //��������
        return tableHeader;
        
    }
    
    /* ���� Javadoc��
	 * @see javax.swing.JTable#getDefaultRenderer(java.lang.Class)
	 */
	
	/**
     * @Override
     */
    public boolean isCellEditable(int row,int column)
    {
        return false;   //��Ԫ�񲻿��޸�
    }
}}

