package uk.ac.kcl.rowmappers;

import uk.ac.kcl.model.BinaryDocument;
import uk.ac.kcl.model.Document;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by rich on 16/04/16.
 */
public class BinaryDocumentRowMapper extends DocumentRowMapper {

    @Override
    public Document mapRow(ResultSet rs, int i) throws SQLException {
        //ResultSetMetaData meta = rs.getMetaData();
        Document doc = new BinaryDocument(rs.getBytes(env.getProperty("binaryFieldName")));
        mapFields(doc,rs);
        return doc;
    }

}
