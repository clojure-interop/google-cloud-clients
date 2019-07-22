(ns com.google.cloud.bigtable.admin.v2.models.ModifyColumnFamiliesRequest
  "Fluent wrapper for ModifyColumnFamiliesRequest

  Allows for the following ColumnFamily modifications:


    create family, optionally with GCRules.GCRule
    update existing family GCRules.GCRule
    drop an existing family"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models ModifyColumnFamiliesRequest]))

(defn *of
  "table-id - `java.lang.String`

  returns: `com.google.cloud.bigtable.admin.v2.models.ModifyColumnFamiliesRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.ModifyColumnFamiliesRequest [^java.lang.String table-id]
    (ModifyColumnFamiliesRequest/of table-id)))

(defn add-family
  "Configures the name and GCRules.GCRule of the new ColumnFamily to be created

  family-id - `java.lang.String`
  gc-rule - `com.google.cloud.bigtable.admin.v2.models.GCRules$GCRule`

  returns: `com.google.cloud.bigtable.admin.v2.models.ModifyColumnFamiliesRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.ModifyColumnFamiliesRequest [^ModifyColumnFamiliesRequest this ^java.lang.String family-id ^com.google.cloud.bigtable.admin.v2.models.GCRules$GCRule gc-rule]
    (-> this (.addFamily family-id gc-rule)))
  (^com.google.cloud.bigtable.admin.v2.models.ModifyColumnFamiliesRequest [^ModifyColumnFamiliesRequest this ^java.lang.String family-id]
    (-> this (.addFamily family-id))))

(defn update-family
  "Updates the GCRules.GCRule of existing ColumnFamily

  family-id - `java.lang.String`
  gc-rule - `com.google.cloud.bigtable.admin.v2.models.GCRules$GCRule`

  returns: `com.google.cloud.bigtable.admin.v2.models.ModifyColumnFamiliesRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.ModifyColumnFamiliesRequest [^ModifyColumnFamiliesRequest this ^java.lang.String family-id ^com.google.cloud.bigtable.admin.v2.models.GCRules$GCRule gc-rule]
    (-> this (.updateFamily family-id gc-rule))))

(defn drop-family
  "Drops the specified ColumnFamily

  family-id - `java.lang.String`

  returns: `com.google.cloud.bigtable.admin.v2.models.ModifyColumnFamiliesRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.ModifyColumnFamiliesRequest [^ModifyColumnFamiliesRequest this ^java.lang.String family-id]
    (-> this (.dropFamily family-id))))

(defn to-proto
  "project-id - `java.lang.String`
  instance-id - `java.lang.String`

  returns: `com.google.bigtable.admin.v2.ModifyColumnFamiliesRequest`"
  (^com.google.bigtable.admin.v2.ModifyColumnFamiliesRequest [^ModifyColumnFamiliesRequest this ^java.lang.String project-id ^java.lang.String instance-id]
    (-> this (.toProto project-id instance-id))))

