package seabattle.shared.request;

import seabattle.shared.authtoken.AuthToken;
import seabattle.shared.response.Response;

public class ClickOnBoard implements Request {

    int row;
    int col;
    int id;
    AuthToken authToken;

    public ClickOnBoard(int row, int col, int id) {
        this.row = row;
        this.col = col;
        this.id = id;
    }

    @Override
    public Response handle(RequestHandler requestHandler) {
        return requestHandler.clickOnBoard(this);
    }

    @Override
    public void setAuthToken(AuthToken authToken) {
        this.authToken = authToken;
    }

    @Override
    public AuthToken getAuthToken() {
        return authToken;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
