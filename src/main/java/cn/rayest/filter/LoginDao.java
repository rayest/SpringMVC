package cn.rayest.filter;

import org.springframework.stereotype.Repository;

/**
 * Created by Rayest on 2016/10/22 0022.
 */
@Repository
public interface LoginDao {
    void login(User user);
}
