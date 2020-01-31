package org.pentaho.di.core.vfs;

import org.apache.commons.vfs2.FileSystemOptions;

//
// A simple structure to be used by KettleVFS to pass around and update multiple values
//   related to file information.
class FileInfoContainer {
    boolean relativeFilename = true;
    FileSystemOptions fsOptions = null;
}
