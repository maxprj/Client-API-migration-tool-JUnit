package api.entity.types;

import api.entity.MigrationUnit;
import api.entity.MigrationUnitName;

public interface MigrationUnitWithFullName extends MigrationUnit {
    MigrationUnitName getOriginalName();

    MigrationUnitName getNewName();
}
