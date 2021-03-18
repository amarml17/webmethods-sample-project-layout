package MdrDbtOnlineOnboarding;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.util.Date;
import java.util.Calendar;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.ss.usermodel.*;
// --- <<IS-END-IMPORTS>> ---

public final class utils

{
	// ---( internal utility methods )---

	final static utils _instance = new utils();

	static utils _newInstance() { return new utils(); }

	static utils _cast(Object o) { return (utils)o; }

	// ---( server methods )---




	public static final void yesterdayDateString (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(yesterdayDateString)>> ---
		// @sigtype java 3.5
		// [o] field:0:required dateString
		IDataCursor idc = pipeline.getCursor();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		// Create a calendar object with today date.
		Calendar cal = Calendar.getInstance();
		// Move calendar to yesterday
		cal.add(Calendar.DATE, -1);
		// Get current date of calendar which point to the yesterday now        
		Date yesterday = cal.getTime();
		IDataUtil.put(idc, "dateString", dateFormat.format(yesterday).toString());
		idc.destroy();
		// --- <<IS-END>> ---

                
	}
}

