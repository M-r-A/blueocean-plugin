package io.jenkins.blueocean.rest.model;

import com.google.common.annotations.Beta;
import org.kohsuke.stapler.export.Exported;
import org.kohsuke.stapler.export.ExportedBean;

import java.util.List;

/**
 * A Table-like data structure for serving tabular data
 */
@ExportedBean
@Beta
public abstract class BlueTable {

    public static final String ROWS = "rows";

    @ExportedBean(defaultVisibility = 2)
    public abstract static class Row {
        @Exported(name = "id")
        public abstract String getId();
    }

    @Exported(name = ROWS)
    public abstract List<Row> getRows();
}