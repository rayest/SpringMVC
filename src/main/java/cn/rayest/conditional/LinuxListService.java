package cn.rayest.conditional;

/**
 * Created by Rayest on 2016/11/7 0007.
 */
public class LinuxListService implements ListService {
    @Override
    public String showListCmd() {
        return "ls";
    }
}
