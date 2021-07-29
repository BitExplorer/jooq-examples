package example.generate.code.dao;

import java.util.List;

/**
 * @author tabuyos
 */
public class PageResult<T> {
  List<T> data;

  public List<T> getData() {
    return data;
  }

  public void setData(List<T> data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "PageResult{" +
      "data=" + data +
      '}';
  }
}
