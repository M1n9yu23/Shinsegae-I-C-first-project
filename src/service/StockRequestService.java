package service;

import dto.StockRequestDto;
import java.io.IOException;
import java.sql.SQLException;

public interface StockRequestService {

  void create(StockRequestDto purchaseOrder) throws IOException, SQLException;
}
