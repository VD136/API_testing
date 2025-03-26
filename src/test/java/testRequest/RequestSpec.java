package testRequest;

import endpoints.Endpoints;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpec {

	private static final RequestSpecification req_Base= new RequestSpecBuilder()
			.setBaseUri(Endpoints.BaseURL) 	
			.setContentType(ContentType.JSON).build();
	
	private static final RequestSpecification GetRequest_Base= new RequestSpecBuilder()
			.setBaseUri(Endpoints.BaseURL) 	
			.build();
	public static RequestSpecification UserLogin() {
		return new RequestSpecBuilder().addRequestSpecification(req_Base)
				.setBasePath(Endpoints.Post_Login).build();
	}
	public static RequestSpecification CreateProgram() {
		return new RequestSpecBuilder().addRequestSpecification(req_Base)
				.setBasePath(Endpoints.Post_Program).build();
	}
	public static RequestSpecification Get_AllClass() {
		return new RequestSpecBuilder().addRequestSpecification(GetRequest_Base)
				.setBasePath(Endpoints.Get_AllClass).build();
	}
	
	public static RequestSpecification Get_AllClass_byStaffID(String staffId ) {
		return new RequestSpecBuilder().addRequestSpecification(req_Base)
				.setBasePath(Endpoints.Get_AllClass_byStaffID)
				.addPathParam("staffId",staffId)				
				.build();
	}
	public static RequestSpecification Get_AllClass_byStaffID_InvalidENDpoint(String staffId ) {
		return new RequestSpecBuilder().addRequestSpecification(req_Base)
				.setBasePath(Endpoints.Get_AllClass_byStaffID_Invalid)				
				.build();
	}
	public static RequestSpecification Get_ALlRecordings() {
		return new RequestSpecBuilder().addRequestSpecification(req_Base)
				.setBasePath(Endpoints.Get_ALlRecordings).build();
	}
	
	public static RequestSpecification Get_ALlRecordings_Invalid() {
		return new RequestSpecBuilder().addRequestSpecification(req_Base)
				.setBasePath(Endpoints.Get_ALlRecordings_Invalid).build();
	}
	public static RequestSpecification Get_AllRecordings_byClassID(String csId) {
		return new RequestSpecBuilder().addRequestSpecification(req_Base)
				.setBasePath(Endpoints.Get_AllRecordings_byClassID)
				.addPathParam("classId", csId)
				.build();
	}
	public static RequestSpecification Get_AllRecordings_byClassID_InvalidEndpoint() {
		return new RequestSpecBuilder().addRequestSpecification(req_Base)
				.setBasePath(Endpoints.Get_AllRecordings_byClassID_Invalid)
				.build();
	}
	public static RequestSpecification Put_Class(String csId){
		return new RequestSpecBuilder().addRequestSpecification(req_Base)
				.setBasePath(Endpoints.Put_Class)
				.addPathParam("classId", csId)
				.build();
	}
	public static RequestSpecification Put_Class_InvalidEndpoint(){
		return new RequestSpecBuilder().addRequestSpecification(req_Base)
				.setBasePath(Endpoints.Put_Class_Invalid)
				.build();
	}
	public static RequestSpecification  Put_classREcording(String csId){
		return new RequestSpecBuilder().addRequestSpecification(req_Base)
				.setBasePath(Endpoints.Put_classREcording)
				.addPathParam("classId", csId)
				.build();
	}
	public static RequestSpecification Put_classREcordingInvalidEnd(){
		return new RequestSpecBuilder().addRequestSpecification(req_Base)
				.setBasePath(Endpoints.Put_classREcordingInvalidEnd)
				.build();
	}
	
	public static RequestSpecification Delete_classByID(String csId){
		return new RequestSpecBuilder().addRequestSpecification(req_Base)
				.setBasePath(Endpoints.Delete_classByID)
				.addPathParam("classId", csId)
				.build();
	}
	public static RequestSpecification Delete_classByID_Invalid(String csId){
		return new RequestSpecBuilder().addRequestSpecification(req_Base)
				.setBasePath(Endpoints.Delete_classByID_Invalid).build();
	}
}
