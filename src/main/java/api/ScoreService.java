package api;



import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;


@Path("/")
public class ScoreService {
	


	
	@GET
	@Path("/Temp")
	@Produces("application/json")
	public String getTemp() {
		String pattern = "{ \"s431h\":\"%s\", \"s423\":\"%s\", \"s421\": \"%s\",\"s422\":\"%s\", \"s425\":\"%s\", \"s431f\": \"%s\",\"s405\":\"%s\", \"s424\":\"%s\", \"s416\": \"%s\",\"s432\":\"%s\", \"s408\":\"%s\", \"hall4nord\": \"%s\"}";
		return String.format(pattern,Score.S431H,Score.S423,Score.S421,Score.S422,Score.S425,Score.S431F,Score.S405,Score.S424,Score.S416,Score.S432,Score.S408,Score.HALL4NORD );	

	}
	
	

	
	@GET @Path("/Temp/s431h")@Produces("text/plain")
	public float gettemp1() {return Score.S431H;}
	
	@GET @Path("/Temp/s423")@Produces("text/plain")
	public float gettemp2() {return Score.S423;}
	
	@GET @Path("/Temp/s421")@Produces("text/plain")
	public float gettemp3() {return Score.S421;}
	
	@GET @Path("/Temp/s422")@Produces("text/plain")
	public float gettemp4() {return Score.S422;}
	
	@GET @Path("/Temp/s425")@Produces("text/plain")
	public float gettemp7() {return Score.S425;}
	
	@GET @Path("/Temp/s431f")@Produces("text/plain")
	public float gettemp8() {return Score.S431F;}
	
	@GET @Path("/Temp/s405")@Produces("text/plain")
	public float gettemp9() {return Score.S405;}
	
	@GET @Path("/Temp/s424")@Produces("text/plain")
	public float gettemp10() {return Score.S424;}
	
	@GET @Path("/Temp/s416")@Produces("text/plain")
	public float gettemp11() {return Score.S416;}
	
	@GET @Path("/Temp/s432")@Produces("text/plain")
	public float gettemp12() {return Score.S432;}
	
	@GET @Path("/Temp/s408")@Produces("text/plain")
	public float gettemp13() {return Score.S408;}
	
	@GET @Path("/Temp/hall4nord")@Produces("text/plain")
	public float gettemp14() {return Score.HALL4NORD;}
	
	
	
	@PUT
	@Path("/Temp")
	@Produces("application/json")
	public String update(@QueryParam("s431h") float s431h, 
	                        @QueryParam("s423") float s423, 
	                        @QueryParam("s421")   float s421,
							@QueryParam("s422") float s422, 
    						@QueryParam("s425")   float s425,
							@QueryParam("s431f") float s431f, 
							@QueryParam("s424")   float s424,
							@QueryParam("s416") float s416, 
							@QueryParam("s432")   float s432,
							@QueryParam("s408") float s408, 
							@QueryParam("hall4nord")   float hall4nord){
	   Score.S431H   = s431h;
	   Score.S423   = s423;
	   Score.S421    = s421;
	   Score.S422   = s422;
	   Score.S425   = s425;
	   Score.S431F = s431f;
	   Score.S424   = s424;
	   Score.S416   = s416;
	   Score.S432 = s432;
	   Score.S408   = s408;
	   Score.HALL4NORD = hall4nord;
	
	
		String pattern = "{ \"s431h\":\"%s\", \"s423\":\"%s\", \"s421\": \"%s\",\"s422\":\"%s\", \"s425\":\"%s\", \"s431f\": \"%s\",\"s405\":\"%s\", \"s424\":\"%s\", \"s416\": \"%s\",\"s432\":\"%s\", \"s408\":\"%s\", \"hall4nord\": \"%s\"}";
		return String.format(pattern,Score.S431H,Score.S423,Score.S421,Score.S422,Score.S425,Score.S431F,Score.S405,Score.S424,Score.S416,Score.S432,Score.S408,Score.HALL4NORD );	

	}

	
	

}
