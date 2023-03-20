package shop.mtcoding.demo.model.user;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRespository {
    public int insert(User user);

    public int updateById(User user);

    public int deleteById(int id);

    public List<User> findAll();

    public User findById(int id);

    public User findByUsernameAndPassword(User user);
}
