package endpoints;

public class Endpoints {

	public static final String BaseURL = "https://lms-hackthon-feb25-803334c87fbe.herokuapp.com/lms";
	//User Login--endpoint
    public static String Post_Login= "/login";
    public static String Post_Program="/saveprogram";
    public static String Get_AllPrograms="/allPrograms";
    public static String Get_AllBatches="/batches";
    public static String Get_AllClass="/allClasses";
    //***class part 2 code
    public static String Get_AllClass_byStaffID="/classesByStaff/{staffId}";
    public static String Get_AllClass_byStaffID_Invalid="/classesByStaff/staffId/http";
    public static String Get_ALlRecordings="/classrecordings";
    public static String Get_ALlRecordings_Invalid="/classrecordings/staff";
    public static String Get_AllRecordings_byClassID="/classRecordings/{classId}";
    public static String Get_AllRecordings_byClassID_Invalid="/classRecordings/cl";
    public static String Put_Class="/updateClass/{classId}";
    public static String Put_Class_Invalid="/updateClass/lassId";
    public static String Put_classREcording="/updateClassrecording/{classId}";
    public static String Put_classREcordingInvalidEnd ="/updateClassrecording/classId";
    public static String Delete_classByID="/deleteByClass/{classId}";
    public static String Delete_classByID_Invalid="/deleteByClass/classId";
    //***class part 2 code END
}
		