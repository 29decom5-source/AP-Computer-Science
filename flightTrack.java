public class flightTrack{
    private int altitude;
    private int streak;
    private boolean isClimbing;
    public flightTrack(int ca){
        altitude = ca;
        streak = 0;
        isClimbing = false;

    }
    public String logAltitude(int reading){
        if (reading > altitude && isClimbing == false){
            isClimbing = true;
            
        }
        else if (reading < altitude && isClimbing == false){
            isClimbing = true;
            streak += 1
        
        }
        else if (reading > altitude && isClimbing == true){
            isClimbing = true;
        }
        else{
            isClimbing = true;
    }
}
}
