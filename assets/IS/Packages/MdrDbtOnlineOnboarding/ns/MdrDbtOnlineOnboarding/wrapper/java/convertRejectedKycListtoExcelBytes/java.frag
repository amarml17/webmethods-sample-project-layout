<?xml version="1.0" encoding="UTF-8"?>

<Values version="2.0">
  <value name="name">convertRejectedKycListtoExcelBytes</value>
  <array name="sig" type="value" depth="1">
    <value>[i] record:1:optional list</value>
    <value>[i] - field:0:optional nik</value>
    <value>[i] - field:0:optional name</value>
    <value>[i] - field:0:optional email</value>
    <value>[i] - field:0:optional mobileNo</value>
    <value>[i] - field:0:optional processStage</value>
    <value>[i] - field:0:optional processStartTime</value>
    <value>[i] - field:0:optional processLastUpdatedTime</value>
    <value>[i] - field:0:required kycStatus</value>
    <value>[i] - field:0:required rejectCategory</value>
    <value>[i] - field:0:required rejectReason</value>
    <value>[o] object:0:optional byteArray</value>
  </array>
  <value name="sigtype">java 3.5</value>
  <value name="encodeutf8">true</value>
  <value name="body">Ly8gcGlwZWxpbmUKSURhdGFDdXJzb3IgcGlwZWxpbmVDdXJzb3IgPSBwaXBlbGluZS5nZXRDdXJz
b3IoKTsKCkhTU0ZXb3JrYm9vayB3b3JrYm9vayA9IG5ldyBIU1NGV29ya2Jvb2soKTsKSFNTRlNo
ZWV0IHNoZWV0ID0gd29ya2Jvb2suY3JlYXRlU2hlZXQoIk9ubGluZU9uYm9hcmRpbmciKTsKCkZv
bnQgaGVhZGVyRm9udCA9IHdvcmtib29rLmNyZWF0ZUZvbnQoKTsKaGVhZGVyRm9udC5zZXRGb250
SGVpZ2h0SW5Qb2ludHMoKHNob3J0KSAxMyk7CmhlYWRlckZvbnQuc2V0Q29sb3IoSW5kZXhlZENv
bG9ycy5CUk9XTi5nZXRJbmRleCgpKTsKClN0cmluZ1tdIGNvbHVtbnMgPSB7IlByb2Nlc3MgU3Rh
cnQgVGltZSIsIk5JSyIsICJOYW1lIiwgIlByb2Nlc3MgTGFzdCBVcGRhdGVkIiwgIkVtYWlsIiwi
TW9iaWxlIE51bWJlciIsIlByb2Nlc3MgU3RhZ2UiLCJLWUMgU3RhdHVzIiwiUmVqZWN0IENhdGVn
b3J5IiwiUmVqZWN0IFJlYXNvbiJ9OwoKQ2VsbFN0eWxlIGhlYWRlckNlbGxTdHlsZSA9IHdvcmti
b29rLmNyZWF0ZUNlbGxTdHlsZSgpOwpoZWFkZXJDZWxsU3R5bGUuc2V0Rm9udChoZWFkZXJGb250
KTsKClJvdyBoZWFkZXJSb3cgPSBzaGVldC5jcmVhdGVSb3coMCk7CgovLyBDcmVhdGUgY2VsbHMK
Zm9yKGludCBpID0gMDsgaSA8IGNvbHVtbnMubGVuZ3RoOyBpKyspIHsKICAgIENlbGwgY2VsbCA9
IGhlYWRlclJvdy5jcmVhdGVDZWxsKGkpOwogICAgY2VsbC5zZXRDZWxsVmFsdWUoY29sdW1uc1tp
XSk7CiAgICBjZWxsLnNldENlbGxTdHlsZShoZWFkZXJDZWxsU3R5bGUpOwp9CgppbnQgcm93TnVt
ID0gMTsKSURhdGFbXQlsaXN0ID0gSURhdGFVdGlsLmdldElEYXRhQXJyYXkoIHBpcGVsaW5lQ3Vy
c29yLCAibGlzdCIgKTsKaWYgKCBsaXN0ICE9IG51bGwpCnsKCWZvciAoIGludCBpID0gMDsgaSA8
IGxpc3QubGVuZ3RoOyBpKysgKQoJewoJCUlEYXRhQ3Vyc29yIGxpc3RDdXJzb3IgPSBsaXN0W2ld
LmdldEN1cnNvcigpOwoJCQlTdHJpbmcJbmlrID0gSURhdGFVdGlsLmdldFN0cmluZyggbGlzdEN1
cnNvciwgIm5payIgKTsKCQkJU3RyaW5nCW5hbWUgPSBJRGF0YVV0aWwuZ2V0U3RyaW5nKCBsaXN0
Q3Vyc29yLCAibmFtZSIgKTsKCQkJU3RyaW5nCWVtYWlsID0gSURhdGFVdGlsLmdldFN0cmluZygg
bGlzdEN1cnNvciwgImVtYWlsIiApOwoJCQlTdHJpbmcJbW9iaWxlTm8gPSBJRGF0YVV0aWwuZ2V0
U3RyaW5nKCBsaXN0Q3Vyc29yLCAibW9iaWxlTm8iICk7CgkJCVN0cmluZwlwcm9jZXNzTGFzdFVw
ZGF0ZWRUaW1lID0gSURhdGFVdGlsLmdldFN0cmluZyggbGlzdEN1cnNvciwgInByb2Nlc3NMYXN0
VXBkYXRlZFRpbWUiICk7CgkJCVN0cmluZwlwcm9jZXNzU3RhcnRUaW1lID0gSURhdGFVdGlsLmdl
dFN0cmluZyggbGlzdEN1cnNvciwgInByb2Nlc3NTdGFydFRpbWUiICk7CgkJCVN0cmluZwlwcm9j
ZXNzU3RhZ2UgPSBJRGF0YVV0aWwuZ2V0U3RyaW5nKCBsaXN0Q3Vyc29yLCAicHJvY2Vzc1N0YWdl
IiApOwoJCQlTdHJpbmcJa3ljU3RhdHVzID0gSURhdGFVdGlsLmdldFN0cmluZyggbGlzdEN1cnNv
ciwgImt5Y1N0YXR1cyIgKTsKCQkJU3RyaW5nCXJlamVjdENhdGVnb3J5ID0gSURhdGFVdGlsLmdl
dFN0cmluZyggbGlzdEN1cnNvciwgInJlamVjdENhdGVnb3J5IiApOwoJCQlTdHJpbmcJcmVqZWN0
UmVhc29uID0gSURhdGFVdGlsLmdldFN0cmluZyggbGlzdEN1cnNvciwgInJlamVjdFJlYXNvbiIg
KTsKCQkJCgkJCQoJCQlSb3cgcm93ID0gc2hlZXQuY3JlYXRlUm93KHJvd051bSsrKTsKCQkJcm93
LmNyZWF0ZUNlbGwoMCkuc2V0Q2VsbFZhbHVlKHByb2Nlc3NTdGFydFRpbWUpOwoJCQlyb3cuY3Jl
YXRlQ2VsbCgxKS5zZXRDZWxsVmFsdWUobmlrKTsKCQkJcm93LmNyZWF0ZUNlbGwoMikuc2V0Q2Vs
bFZhbHVlKG5hbWUpOwoJCQlyb3cuY3JlYXRlQ2VsbCgzKS5zZXRDZWxsVmFsdWUocHJvY2Vzc0xh
c3RVcGRhdGVkVGltZSk7CgkJCXJvdy5jcmVhdGVDZWxsKDQpLnNldENlbGxWYWx1ZShlbWFpbCk7
CgkJCXJvdy5jcmVhdGVDZWxsKDUpLnNldENlbGxWYWx1ZShtb2JpbGVObyk7CgkJCXJvdy5jcmVh
dGVDZWxsKDYpLnNldENlbGxWYWx1ZShwcm9jZXNzU3RhZ2UpOwoJCQlyb3cuY3JlYXRlQ2VsbCg3
KS5zZXRDZWxsVmFsdWUoa3ljU3RhdHVzKTsKCQkJcm93LmNyZWF0ZUNlbGwoOCkuc2V0Q2VsbFZh
bHVlKHJlamVjdENhdGVnb3J5KTsKCQkJcm93LmNyZWF0ZUNlbGwoOSkuc2V0Q2VsbFZhbHVlKHJl
amVjdFJlYXNvbik7CgkJCQoJCQkKCQkJCgkJbGlzdEN1cnNvci5kZXN0cm95KCk7Cgl9Cn0gCnBp
cGVsaW5lQ3Vyc29yLmRlc3Ryb3koKTsKc2hlZXQuYXV0b1NpemVDb2x1bW4oMCk7ICAgIApzaGVl
dC5hdXRvU2l6ZUNvbHVtbigxKTsKc2hlZXQuYXV0b1NpemVDb2x1bW4oMik7CnNoZWV0LmF1dG9T
aXplQ29sdW1uKDMpOwpzaGVldC5hdXRvU2l6ZUNvbHVtbig0KTsKc2hlZXQuYXV0b1NpemVDb2x1
bW4oNSk7CnNoZWV0LmF1dG9TaXplQ29sdW1uKDYpOwoKQnl0ZUFycmF5T3V0cHV0U3RyZWFtIGJv
cyA9IG5ldyBCeXRlQXJyYXlPdXRwdXRTdHJlYW0oKTsKdHJ5IHsKICAgIHRyeSB7CgkJd29ya2Jv
b2sud3JpdGUoYm9zKTsKCQlib3MuY2xvc2UoKTsKCX0gY2F0Y2ggKElPRXhjZXB0aW9uIGUpIHsK
CQkvLyBUT0RPIEF1dG8tZ2VuZXJhdGVkIGNhdGNoIGJsb2NrCgkJZS5wcmludFN0YWNrVHJhY2Uo
KTsKCX0KfSBmaW5hbGx5IHsKICAgIHRyeSB7CgkJYm9zLmNsb3NlKCk7Cgl9IGNhdGNoIChJT0V4
Y2VwdGlvbiBlKSB7CgkJLy8gVE9ETyBBdXRvLWdlbmVyYXRlZCBjYXRjaCBibG9jawoJCWUucHJp
bnRTdGFja1RyYWNlKCk7Cgl9Cn0KLy8gcGlwZWxpbmUKSURhdGFDdXJzb3IgcGlwZWxpbmVDdXJz
b3JfMSA9IHBpcGVsaW5lLmdldEN1cnNvcigpOwpieXRlW10gYnl0ZUFycmF5ID0gYm9zLnRvQnl0
ZUFycmF5KCk7CklEYXRhVXRpbC5wdXQoIHBpcGVsaW5lQ3Vyc29yXzEsICJieXRlQXJyYXkiLCBi
eXRlQXJyYXkgKTsKcGlwZWxpbmVDdXJzb3JfMS5kZXN0cm95KCk7CgkKCQoJCgkKCQoJCgkKCQoJ
CgkK</value>
</Values>
