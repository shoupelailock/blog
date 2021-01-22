package cn.zjw.mongo.entity;

import cn.zjw.mongo.util.MongoObjectId;
import com.google.gson.annotations.JsonAdapter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

/**
 * Address
 *
 * @author zjw
 * @createTime 2021/1/22 11:24
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    @JsonAdapter(MongoObjectId.class)
    private ObjectId _id;
    private String addressName;
}