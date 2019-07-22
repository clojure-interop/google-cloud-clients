(ns com.google.cloud.bigquery.DatasetInfo
  "Google BigQuery Dataset information. A dataset is a grouping mechanism that holds zero or more
  tables. Datasets are the lowest level unit of access control; you cannot control access at the
  table level."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigquery DatasetInfo]))

(defn *new-builder
  "Returns a builder for the DatasetInfo object given it's user-defined project and dataset ids.

  project-id - `java.lang.String`
  dataset-id - `java.lang.String`

  returns: `com.google.cloud.bigquery.DatasetInfo$Builder`"
  (^com.google.cloud.bigquery.DatasetInfo$Builder [^java.lang.String project-id ^java.lang.String dataset-id]
    (DatasetInfo/newBuilder project-id dataset-id))
  (^com.google.cloud.bigquery.DatasetInfo$Builder [^com.google.cloud.bigquery.DatasetId dataset-id]
    (DatasetInfo/newBuilder dataset-id)))

(defn *of
  "Returns a DatasetInfo object given it's identity.

  dataset-id - `com.google.cloud.bigquery.DatasetId`

  returns: `com.google.cloud.bigquery.DatasetInfo`"
  (^com.google.cloud.bigquery.DatasetInfo [^com.google.cloud.bigquery.DatasetId dataset-id]
    (DatasetInfo/of dataset-id)))

(defn get-location
  "Returns the geographic location where the dataset should reside.

  returns: `java.lang.String`"
  (^java.lang.String [^DatasetInfo this]
    (-> this (.getLocation))))

(defn get-dataset-id
  "Returns the dataset identity.

  returns: `com.google.cloud.bigquery.DatasetId`"
  (^com.google.cloud.bigquery.DatasetId [^DatasetInfo this]
    (-> this (.getDatasetId))))

(defn get-friendly-name
  "Returns a user-friendly name for the dataset.

  returns: `java.lang.String`"
  (^java.lang.String [^DatasetInfo this]
    (-> this (.getFriendlyName))))

(defn get-default-table-lifetime
  "Returns the default lifetime of all tables in the dataset, in milliseconds. Once this property
   is set, all newly-created tables in the dataset will have an expirationTime property set to the
   creation time plus the value in this property, and changing the value will only affect new
   tables, not existing ones. When the expirationTime for a given table is reached, that table
   will be deleted automatically. If a table's expirationTime is modified or removed before the
   table expires, or if you provide an explicit expirationTime when creating a table, that value
   takes precedence over the default expiration time indicated by this property.

   Update the default table expiration time for a dataset.



   Dataset dataset = bigquery.getDataset(DatasetId.of(\"my_dataset\"));
   Long beforeExpiration = dataset.getDefaultTableLifetime();

   Long oneDayMilliseconds = 24 * 60 * 60 * 1000L;
   Dataset.Builder builder = dataset.toBuilder();
   builder.setDefaultTableLifetime(oneDayMilliseconds);
   bigquery.update(builder.build());  // API request.

  returns: `java.lang.Long`"
  (^java.lang.Long [^DatasetInfo this]
    (-> this (.getDefaultTableLifetime))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DatasetInfo this]
    (-> this (.toString))))

(defn get-acl
  "Returns the dataset's access control configuration.

   Update the ACLs for a dataset.



   Dataset dataset = bigquery.getDataset(DatasetId.of(\"my_dataset\"));
   List<Acl> beforeAcls = dataset.getAcl();

   // Make a copy of the ACLs so that they can be modified.
   ArrayList<Acl> acls = new ArrayList<>(beforeAcls);
   acls.add(Acl.of(new Acl.User(\"sample.bigquery.dev@gmail.com\"), Acl.Role.READER));
   Dataset.Builder builder = dataset.toBuilder();
   builder.setAcl(acls);

   bigquery.update(builder.build());  // API request.

  returns: `java.util.List<com.google.cloud.bigquery.Acl>`"
  (^java.util.List [^DatasetInfo this]
    (-> this (.getAcl))))

(defn get-last-modified
  "Returns the time when this dataset or any of its tables was last modified, in milliseconds
   since the epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^DatasetInfo this]
    (-> this (.getLastModified))))

(defn get-etag
  "Returns the hash of the dataset resource.

  returns: `java.lang.String`"
  (^java.lang.String [^DatasetInfo this]
    (-> this (.getEtag))))

(defn get-description
  "Returns a user-friendly description for the dataset.

  returns: `java.lang.String`"
  (^java.lang.String [^DatasetInfo this]
    (-> this (.getDescription))))

(defn get-labels
  "Return a map for labels applied to the dataset.

  returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^DatasetInfo this]
    (-> this (.getLabels))))

(defn get-self-link
  "Returns an URL that can be used to access the resource again. The returned URL can be used for
   get or update requests.

  returns: `java.lang.String`"
  (^java.lang.String [^DatasetInfo this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DatasetInfo this]
    (-> this (.hashCode))))

(defn get-generated-id
  "Returns the service-generated id for the dataset.

  returns: `java.lang.String`"
  (^java.lang.String [^DatasetInfo this]
    (-> this (.getGeneratedId))))

(defn equals
  "obj - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DatasetInfo this ^java.lang.Object obj]
    (-> this (.equals obj))))

(defn get-creation-time
  "Returns the time when this dataset was created, in milliseconds since the epoch.

  returns: `java.lang.Long`"
  (^java.lang.Long [^DatasetInfo this]
    (-> this (.getCreationTime))))

(defn to-builder
  "Returns a builder for the dataset object.

  returns: `com.google.cloud.bigquery.DatasetInfo$Builder`"
  (^com.google.cloud.bigquery.DatasetInfo$Builder [^DatasetInfo this]
    (-> this (.toBuilder))))

