<html lang="en">
<head>
<style>
button {
    position:absolute;
    width: 150px;
}
</style>
<body>
<h3>OOB SUPPORT SERVICES </h3>
<h3> GET ACTIVE SESSIONS Report</h3>
<div>
  <form action="/invoke/MdrDbtOnlineOnboarding.wrapper/getActiveSessionsReportAdHoc"  target="_self" method="get" enctype="multipart/form-data">
  <br>
  <br>
    Enter Start Date (dd-MMM-yyyy):<br><br>
	<input type="text" name="startDate"></input>
	<br><br>
	Enter End Date(dd-MMM-yyyy):<br><br>
	<input type="text" name="endDate"></input>
    <br><br>
	<p><i>Enter date in the format mentioned next to the field. Sample 01-Jul-2019</i></p>
	<br><br>
    <button type="submit">GET REPORT</button>
	
  </form>
</div>
</body>
</html>