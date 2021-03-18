package MdrDbtOnlineOnboarding.wrapper;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
// --- <<IS-END-IMPORTS>> ---

public final class java

{
	// ---( internal utility methods )---

	final static java _instance = new java();

	static java _newInstance() { return new java(); }

	static java _cast(Object o) { return (java)o; }

	// ---( server methods )---




	public static final void convertActiveSessionsListtoExcelBytes (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(convertActiveSessionsListtoExcelBytes)>> ---
		// @sigtype java 3.5
		// [i] record:1:optional list
		// [i] - field:0:optional nik
		// [i] - field:0:optional name
		// [i] - field:0:optional email
		// [i] - field:0:optional mobileNo
		// [i] - field:0:optional processStage
		// [i] - field:0:optional processStartTime
		// [i] - field:0:optional processLastUpdatedTime
		// [o] object:0:optional byteArray
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("OnlineOnboarding");
		
		Font headerFont = workbook.createFont();
		headerFont.setFontHeightInPoints((short) 13);
		headerFont.setColor(IndexedColors.BROWN.getIndex());
		
		String[] columns = {"Process Start Time","NIK", "Name", "Process Last Updated", "Email","Mobile Number","Process Stage"};
		
		CellStyle headerCellStyle = workbook.createCellStyle();
		headerCellStyle.setFont(headerFont);
		
		Row headerRow = sheet.createRow(0);
		
		// Create cells
		for(int i = 0; i < columns.length; i++) {
		    Cell cell = headerRow.createCell(i);
		    cell.setCellValue(columns[i]);
		    cell.setCellStyle(headerCellStyle);
		}
		
		int rowNum = 1;
		IData[]	list = IDataUtil.getIDataArray( pipelineCursor, "list" );
		if ( list != null)
		{
			for ( int i = 0; i < list.length; i++ )
			{
				IDataCursor listCursor = list[i].getCursor();
					String	nik = IDataUtil.getString( listCursor, "nik" );
					String	name = IDataUtil.getString( listCursor, "name" );
					String	email = IDataUtil.getString( listCursor, "email" );
					String	mobileNo = IDataUtil.getString( listCursor, "mobileNo" );
					String	processLastUpdatedTime = IDataUtil.getString( listCursor, "processLastUpdatedTime" );
					String	processStartTime = IDataUtil.getString( listCursor, "processStartTime" );
					String	processStage = IDataUtil.getString( listCursor, "processStage" );
					
					Row row = sheet.createRow(rowNum++);
					row.createCell(0).setCellValue(processStartTime);
					row.createCell(1).setCellValue(nik);
					row.createCell(2).setCellValue(name);
					row.createCell(3).setCellValue(processLastUpdatedTime);
					row.createCell(4).setCellValue(email);
					row.createCell(5).setCellValue(mobileNo);
					row.createCell(6).setCellValue(processStage);
					
					
					
				listCursor.destroy();
			}
		} 
		pipelineCursor.destroy();
		sheet.autoSizeColumn(0);    
		sheet.autoSizeColumn(1);
		sheet.autoSizeColumn(2);
		sheet.autoSizeColumn(3);
		sheet.autoSizeColumn(4);
		sheet.autoSizeColumn(5);
		sheet.autoSizeColumn(6);
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		try {
		    try {
				workbook.write(bos);
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} finally {
		    try {
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		byte[] byteArray = bos.toByteArray();
		IDataUtil.put( pipelineCursor_1, "byteArray", byteArray );
		pipelineCursor_1.destroy();
			
			
			
			
			
			
			
			
			
		// --- <<IS-END>> ---

                
	}



	public static final void convertClosedSessionsListtoExcelBytes (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(convertClosedSessionsListtoExcelBytes)>> ---
		// @sigtype java 3.5
		// [i] record:1:optional list
		// [i] - field:0:optional nik
		// [i] - field:0:optional name
		// [i] - field:0:optional email
		// [i] - field:0:optional mobileNo
		// [i] - field:0:optional processStage
		// [i] - field:0:optional processStartTime
		// [i] - field:0:optional processLastUpdatedTime
		// [i] - field:0:required status
		// [o] object:0:optional byteArray
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("OnlineOnboarding");
		
		Font headerFont = workbook.createFont();
		headerFont.setFontHeightInPoints((short) 13);
		headerFont.setColor(IndexedColors.BROWN.getIndex());
		
		String[] columns = {"Process Start Time","NIK", "Name", "Process Last Updated", "Email","Mobile Number","Process Stage", "Status"};
		
		CellStyle headerCellStyle = workbook.createCellStyle();
		headerCellStyle.setFont(headerFont);
		
		Row headerRow = sheet.createRow(0);
		
		// Create cells
		for(int i = 0; i < columns.length; i++) {
		    Cell cell = headerRow.createCell(i);
		    cell.setCellValue(columns[i]);
		    cell.setCellStyle(headerCellStyle);
		}
		
		int rowNum = 1;
		IData[]	list = IDataUtil.getIDataArray( pipelineCursor, "list" );
		if ( list != null)
		{
			for ( int i = 0; i < list.length; i++ )
			{
				IDataCursor listCursor = list[i].getCursor();
					String	nik = IDataUtil.getString( listCursor, "nik" );
					String	name = IDataUtil.getString( listCursor, "name" );
					String	email = IDataUtil.getString( listCursor, "email" );
					String	mobileNo = IDataUtil.getString( listCursor, "mobileNo" );
					String	processLastUpdatedTime = IDataUtil.getString( listCursor, "processLastUpdatedTime" );
					String	processStartTime = IDataUtil.getString( listCursor, "processStartTime" );
					String	processStage = IDataUtil.getString( listCursor, "processStage" );
					String	status = IDataUtil.getString( listCursor, "status" );					
					
					Row row = sheet.createRow(rowNum++);
					row.createCell(0).setCellValue(processStartTime);
					row.createCell(1).setCellValue(nik);
					row.createCell(2).setCellValue(name);
					row.createCell(3).setCellValue(processLastUpdatedTime);
					row.createCell(4).setCellValue(email);
					row.createCell(5).setCellValue(mobileNo);
					row.createCell(6).setCellValue(processStage);
					row.createCell(7).setCellValue(status);
					
					
					
				listCursor.destroy();
			}
		} 
		pipelineCursor.destroy();
		sheet.autoSizeColumn(0);    
		sheet.autoSizeColumn(1);
		sheet.autoSizeColumn(2);
		sheet.autoSizeColumn(3);
		sheet.autoSizeColumn(4);
		sheet.autoSizeColumn(5);
		sheet.autoSizeColumn(6);
		sheet.autoSizeColumn(7);
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		try {
		    try {
				workbook.write(bos);
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} finally {
		    try {
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		byte[] byteArray = bos.toByteArray();
		IDataUtil.put( pipelineCursor_1, "byteArray", byteArray );
		pipelineCursor_1.destroy();
			
			
			
			
			
			
			
			
			
			
		// --- <<IS-END>> ---

                
	}



	public static final void convertDocumentListtoExcelBytes (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(convertDocumentListtoExcelBytes)>> ---
		// @sigtype java 3.5
		// [i] record:1:optional list
		// [i] - field:0:optional nik
		// [i] - field:0:optional cifNo
		// [i] - field:0:optional accountNo
		// [i] - field:0:optional cardNo
		// [i] - field:0:optional cardExpiry
		// [i] - field:0:optional createCIFStatus
		// [i] - field:0:optional updateCIFStatus
		// [i] - field:0:optional errorDetails
		// [i] - field:0:optional cifProcessTime
		// [i] - field:0:optional processStartTime
		// [i] - field:0:optional source
		// [i] - field:0:required marketingCode
		// [i] - field:0:required securitiesCompany
		// [i] - field:0:required referralCode
		// [i] - field:0:required saving
		// [i] - field:0:required ebs
		// [i] - field:0:required cc
		// [i] - field:0:required ics
		// [i] - field:0:required inputForm
		// [i] - field:0:required mobileOTP
		// [i] - field:0:required mobileMPIN
		// [o] object:0:optional byteArray
		// pipeline 
		IDataCursor pipelineCursor = pipeline.getCursor();
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("OnlineOnboarding");
		
		Font headerFont = workbook.createFont();
		headerFont.setFontHeightInPoints((short) 13);
		headerFont.setColor(IndexedColors.BROWN.getIndex());
		
		String[] columns = {"NIK", "CIF Creation Status", "CIF","Account Number", "Card Number", "Card Expiry", "Update CIF Profile Status","CIF Process Last Updated","Process Start Time","Source","Marketing Code","Referral Code","Error Details","Securities Company","Saving","HP EBS","Credit Card","HP ICS","Input Form","Mobile OTP","Mobile MPIN"};
		
		CellStyle headerCellStyle = workbook.createCellStyle();
		headerCellStyle.setFont(headerFont);
		
		Row headerRow = sheet.createRow(0);
		
		
		// Create cells
		for(int i = 0; i < columns.length; i++) {
		    Cell cell = headerRow.createCell(i);
		    cell.setCellValue(columns[i]);
		    cell.setCellStyle(headerCellStyle);
		}
		
		int rowNum = 1;
		IData[]	list = IDataUtil.getIDataArray( pipelineCursor, "list" );
		if ( list != null)
		{
			for ( int i = 0; i < list.length; i++ )
			{
				IDataCursor listCursor = list[i].getCursor(); 
					String	nik = IDataUtil.getString( listCursor, "nik" );
					String	cifNo = IDataUtil.getString( listCursor, "cifNo" );
					String	accountNo = IDataUtil.getString( listCursor, "accountNo" );
					String	cardNo = IDataUtil.getString( listCursor, "cardNo" );
					String	cardExpiry = IDataUtil.getString( listCursor, "cardExpiry" );
					String	createCIFStatus = IDataUtil.getString( listCursor, "createCIFStatus" );
					String	updateCIFStatus = IDataUtil.getString( listCursor, "updateCIFStatus" );
					String	errorDetails = IDataUtil.getString( listCursor, "errorDetails" );
					String	cifProcessTime = IDataUtil.getString( listCursor, "cifProcessTime" );
					String	processStartTime = IDataUtil.getString( listCursor, "processStartTime" );
					String	source = IDataUtil.getString( listCursor, "source" );
					String  marketingCode = IDataUtil.getString( listCursor, "marketingCode");
					String  securitiesCompany = IDataUtil.getString( listCursor, "securitiesCompany");
					String  referralCode = IDataUtil.getString( listCursor, "referralCode");
					String  saving = IDataUtil.getString( listCursor, "saving");
					String  ebs = IDataUtil.getString( listCursor, "ebs");
					String  cc = IDataUtil.getString( listCursor, "cc");
					String  ics = IDataUtil.getString( listCursor, "ics");
					String  inputForm = IDataUtil.getString( listCursor, "inputForm");
					String  mobileOTP = IDataUtil.getString( listCursor, "mobileOTP");
					String  mobileMPIN = IDataUtil.getString( listCursor, "mobileMPIN");
					
					Row row = sheet.createRow(rowNum++);
					row.createCell(0).setCellValue(nik);
					row.createCell(1).setCellValue(createCIFStatus);
					row.createCell(2).setCellValue(cifNo);
					row.createCell(3).setCellValue(accountNo);
					row.createCell(4).setCellValue(cardNo);
					row.createCell(5).setCellValue(cardExpiry);
					row.createCell(6).setCellValue(updateCIFStatus);
					row.createCell(7).setCellValue(cifProcessTime);
					row.createCell(8).setCellValue(processStartTime);
					row.createCell(9).setCellValue(source);
					row.createCell(10).setCellValue(marketingCode);
					row.createCell(11).setCellValue(referralCode);					
					row.createCell(12).setCellValue(errorDetails);
					row.createCell(13).setCellValue(securitiesCompany);					
					row.createCell(14).setCellValue(saving);
					row.createCell(15).setCellValue(ebs);
					row.createCell(16).setCellValue(cc);
					row.createCell(17).setCellValue(ics);
					row.createCell(18).setCellValue(inputForm);
					row.createCell(19).setCellValue(mobileOTP);
					row.createCell(20).setCellValue(mobileMPIN);
					
				listCursor.destroy();
			}
		} 
		pipelineCursor.destroy();
		sheet.autoSizeColumn(0);    
		sheet.autoSizeColumn(1);
		sheet.autoSizeColumn(2);
		sheet.autoSizeColumn(3);
		sheet.autoSizeColumn(4);
		sheet.autoSizeColumn(5);
		sheet.autoSizeColumn(6);
		sheet.autoSizeColumn(7);
		sheet.autoSizeColumn(8);
		sheet.autoSizeColumn(9);
		sheet.autoSizeColumn(10);
		sheet.autoSizeColumn(11);
		sheet.autoSizeColumn(12);
		sheet.autoSizeColumn(13);
		sheet.autoSizeColumn(14);
		sheet.autoSizeColumn(15);
		sheet.autoSizeColumn(16);
		sheet.autoSizeColumn(17);
		sheet.autoSizeColumn(18);
		sheet.autoSizeColumn(19);		
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		try {
		    try {
				workbook.write(bos);
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} finally {
		    try {
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		byte[] byteArray = bos.toByteArray();
		IDataUtil.put( pipelineCursor_1, "byteArray", byteArray );
		pipelineCursor_1.destroy();
			
			
			
			
			
			
			
			
			
		// --- <<IS-END>> ---

                
	}



	public static final void convertRejectedKycListtoExcelBytes (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(convertRejectedKycListtoExcelBytes)>> ---
		// @sigtype java 3.5
		// [i] record:1:optional list
		// [i] - field:0:optional nik
		// [i] - field:0:optional name
		// [i] - field:0:optional email
		// [i] - field:0:optional mobileNo
		// [i] - field:0:optional processStage
		// [i] - field:0:optional processStartTime
		// [i] - field:0:optional processLastUpdatedTime
		// [i] - field:0:required kycStatus
		// [i] - field:0:required rejectCategory
		// [i] - field:0:required rejectReason
		// [o] object:0:optional byteArray
		// pipeline
		IDataCursor pipelineCursor = pipeline.getCursor();
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("OnlineOnboarding");
		
		Font headerFont = workbook.createFont();
		headerFont.setFontHeightInPoints((short) 13);
		headerFont.setColor(IndexedColors.BROWN.getIndex());
		
		String[] columns = {"Process Start Time","NIK", "Name", "Process Last Updated", "Email","Mobile Number","Process Stage","KYC Status","Reject Category","Reject Reason"};
		
		CellStyle headerCellStyle = workbook.createCellStyle();
		headerCellStyle.setFont(headerFont);
		
		Row headerRow = sheet.createRow(0);
		
		// Create cells
		for(int i = 0; i < columns.length; i++) {
		    Cell cell = headerRow.createCell(i);
		    cell.setCellValue(columns[i]);
		    cell.setCellStyle(headerCellStyle);
		}
		
		int rowNum = 1;
		IData[]	list = IDataUtil.getIDataArray( pipelineCursor, "list" );
		if ( list != null)
		{
			for ( int i = 0; i < list.length; i++ )
			{
				IDataCursor listCursor = list[i].getCursor();
					String	nik = IDataUtil.getString( listCursor, "nik" );
					String	name = IDataUtil.getString( listCursor, "name" );
					String	email = IDataUtil.getString( listCursor, "email" );
					String	mobileNo = IDataUtil.getString( listCursor, "mobileNo" );
					String	processLastUpdatedTime = IDataUtil.getString( listCursor, "processLastUpdatedTime" );
					String	processStartTime = IDataUtil.getString( listCursor, "processStartTime" );
					String	processStage = IDataUtil.getString( listCursor, "processStage" );
					String	kycStatus = IDataUtil.getString( listCursor, "kycStatus" );
					String	rejectCategory = IDataUtil.getString( listCursor, "rejectCategory" );
					String	rejectReason = IDataUtil.getString( listCursor, "rejectReason" );
					
					
					Row row = sheet.createRow(rowNum++);
					row.createCell(0).setCellValue(processStartTime);
					row.createCell(1).setCellValue(nik);
					row.createCell(2).setCellValue(name);
					row.createCell(3).setCellValue(processLastUpdatedTime);
					row.createCell(4).setCellValue(email);
					row.createCell(5).setCellValue(mobileNo);
					row.createCell(6).setCellValue(processStage);
					row.createCell(7).setCellValue(kycStatus);
					row.createCell(8).setCellValue(rejectCategory);
					row.createCell(9).setCellValue(rejectReason);
					
					
					
				listCursor.destroy();
			}
		} 
		pipelineCursor.destroy();
		sheet.autoSizeColumn(0);    
		sheet.autoSizeColumn(1);
		sheet.autoSizeColumn(2);
		sheet.autoSizeColumn(3);
		sheet.autoSizeColumn(4);
		sheet.autoSizeColumn(5);
		sheet.autoSizeColumn(6);
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		try {
		    try {
				workbook.write(bos);
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} finally {
		    try {
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// pipeline
		IDataCursor pipelineCursor_1 = pipeline.getCursor();
		byte[] byteArray = bos.toByteArray();
		IDataUtil.put( pipelineCursor_1, "byteArray", byteArray );
		pipelineCursor_1.destroy();
			
			
			
			
			
			
			
			
			
			
		// --- <<IS-END>> ---

                
	}



	public static final void waiting (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(waiting)>> ---
		// @sigtype java 3.5
		// [i] field:0:required period
		IDataCursor idc = pipeline.getCursor();
		int period = IDataUtil.getInt(idc, "period", 0);
		idc.destroy(); 
		  
		try {
			Thread.sleep(period);
		} catch (Exception e) {
			// no rethrow please
		}	
			
		// --- <<IS-END>> ---

                
	}
}

