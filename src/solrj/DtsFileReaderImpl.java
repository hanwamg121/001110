/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package solrj;

import java.io.File;

/**
 *
 * @author yltaurb
 */
abstract class DtsFileReaderImpl implements DtsFileReader{
    public abstract String getTxt(File file)throws Exception;
}
