package service;

public interface OrderHistoryService {
    boolean add(int uid, int fid, boolean isPrivateMenu);
    int recommend(int uid);
}
