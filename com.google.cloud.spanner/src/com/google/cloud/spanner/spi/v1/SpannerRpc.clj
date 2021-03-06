(ns com.google.cloud.spanner.spi.v1.SpannerRpc
  "Abstracts remote calls to the Cloud Spanner service. Typically end-consumer code will never use
  this interface; it's main purpose is to abstract the implementation of the public Cloud Spanner
  API from the underlying transport mechanism.

  Each SpannerRPC instance is bound to a particular project and set of authorization
  credentials.

  The interface is currently defined in terms of the generated HTTP client model classes. This
  is purely for expedience; a future version of this interface is likely to be independent of
  transport to allow switching between gRPC and HTTP."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.spi.v1 SpannerRpc]))

(defn execute-partitioned-dml
  "request - `com.google.spanner.v1.ExecuteSqlRequest`
  options - `java.util.Map`
  timeout - `org.threeten.bp.Duration`

  returns: `com.google.spanner.v1.ResultSet`"
  (^com.google.spanner.v1.ResultSet [^SpannerRpc this ^com.google.spanner.v1.ExecuteSqlRequest request ^java.util.Map options ^org.threeten.bp.Duration timeout]
    (-> this (.executePartitionedDml request options timeout))))

(defn get-database
  "database-name - `java.lang.String`

  returns: `com.google.spanner.admin.database.v1.Database`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.spanner.admin.database.v1.Database [^SpannerRpc this ^java.lang.String database-name]
    (-> this (.getDatabase database-name))))

(defn list-databases
  "instance-name - `java.lang.String`
  page-size - `int`
  page-token - `java.lang.String`

  returns: `com.google.cloud.spanner.spi.v1.SpannerRpc$Paginated<com.google.spanner.admin.database.v1.Database>`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.cloud.spanner.spi.v1.SpannerRpc$Paginated [^SpannerRpc this ^java.lang.String instance-name ^Integer page-size ^java.lang.String page-token]
    (-> this (.listDatabases instance-name page-size page-token))))

(defn delete-session
  "session-name - `java.lang.String`
  options - `java.util.Map`

  throws: com.google.cloud.spanner.SpannerException"
  ([^SpannerRpc this ^java.lang.String session-name ^java.util.Map options]
    (-> this (.deleteSession session-name options))))

(defn create-instance
  "parent - `java.lang.String`
  instance-id - `java.lang.String`
  instance - `com.google.spanner.admin.instance.v1.Instance`

  returns: `com.google.api.gax.longrunning.OperationFuture<com.google.spanner.admin.instance.v1.Instance,com.google.spanner.admin.instance.v1.CreateInstanceMetadata>`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.api.gax.longrunning.OperationFuture [^SpannerRpc this ^java.lang.String parent ^java.lang.String instance-id ^com.google.spanner.admin.instance.v1.Instance instance]
    (-> this (.createInstance parent instance-id instance))))

(defn update-database-ddl
  "database-name - `java.lang.String`
  update-database-statements - `java.lang.Iterable`
  update-id - `java.lang.String`

  returns: `com.google.api.gax.longrunning.OperationFuture<com.google.protobuf.Empty,com.google.spanner.admin.database.v1.UpdateDatabaseDdlMetadata>`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.api.gax.longrunning.OperationFuture [^SpannerRpc this ^java.lang.String database-name ^java.lang.Iterable update-database-statements ^java.lang.String update-id]
    (-> this (.updateDatabaseDdl database-name update-database-statements update-id))))

(defn list-instances
  "page-size - `int`
  page-token - `java.lang.String`
  filter - `java.lang.String`

  returns: `com.google.cloud.spanner.spi.v1.SpannerRpc$Paginated<com.google.spanner.admin.instance.v1.Instance>`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.cloud.spanner.spi.v1.SpannerRpc$Paginated [^SpannerRpc this ^Integer page-size ^java.lang.String page-token ^java.lang.String filter]
    (-> this (.listInstances page-size page-token filter))))

(defn read
  "request - `com.google.spanner.v1.ReadRequest`
  consumer - `com.google.cloud.spanner.spi.v1.SpannerRpc$ResultStreamConsumer`
  options - `java.util.Map`

  returns: `com.google.cloud.spanner.spi.v1.SpannerRpc$StreamingCall`"
  (^com.google.cloud.spanner.spi.v1.SpannerRpc$StreamingCall [^SpannerRpc this ^com.google.spanner.v1.ReadRequest request ^com.google.cloud.spanner.spi.v1.SpannerRpc$ResultStreamConsumer consumer ^java.util.Map options]
    (-> this (.read request consumer options))))

(defn create-session
  "database-name - `java.lang.String`
  labels - `java.util.Map`
  options - `java.util.Map`

  returns: `com.google.spanner.v1.Session`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.spanner.v1.Session [^SpannerRpc this ^java.lang.String database-name ^java.util.Map labels ^java.util.Map options]
    (-> this (.createSession database-name labels options))))

(defn get-instance-config
  "instance-config-name - `java.lang.String`

  returns: `com.google.spanner.admin.instance.v1.InstanceConfig`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.spanner.admin.instance.v1.InstanceConfig [^SpannerRpc this ^java.lang.String instance-config-name]
    (-> this (.getInstanceConfig instance-config-name))))

(defn execute-batch-dml
  "build - `com.google.spanner.v1.ExecuteBatchDmlRequest`
  options - `java.util.Map`

  returns: `com.google.spanner.v1.ExecuteBatchDmlResponse`"
  (^com.google.spanner.v1.ExecuteBatchDmlResponse [^SpannerRpc this ^com.google.spanner.v1.ExecuteBatchDmlRequest build ^java.util.Map options]
    (-> this (.executeBatchDml build options))))

(defn delete-instance
  "instance-name - `java.lang.String`

  throws: com.google.cloud.spanner.SpannerException"
  ([^SpannerRpc this ^java.lang.String instance-name]
    (-> this (.deleteInstance instance-name))))

(defn commit
  "commit-request - `com.google.spanner.v1.CommitRequest`
  options - `java.util.Map`

  returns: `com.google.spanner.v1.CommitResponse`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.spanner.v1.CommitResponse [^SpannerRpc this ^com.google.spanner.v1.CommitRequest commit-request ^java.util.Map options]
    (-> this (.commit commit-request options))))

(defn shutdown
  ""
  ([^SpannerRpc this]
    (-> this (.shutdown))))

(defn closed?
  "returns: `boolean`"
  (^Boolean [^SpannerRpc this]
    (-> this (.isClosed))))

(defn get-instance
  "instance-name - `java.lang.String`

  returns: `com.google.spanner.admin.instance.v1.Instance`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.spanner.admin.instance.v1.Instance [^SpannerRpc this ^java.lang.String instance-name]
    (-> this (.getInstance instance-name))))

(defn update-instance
  "instance - `com.google.spanner.admin.instance.v1.Instance`
  field-mask - `com.google.protobuf.FieldMask`

  returns: `com.google.api.gax.longrunning.OperationFuture<com.google.spanner.admin.instance.v1.Instance,com.google.spanner.admin.instance.v1.UpdateInstanceMetadata>`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.api.gax.longrunning.OperationFuture [^SpannerRpc this ^com.google.spanner.admin.instance.v1.Instance instance ^com.google.protobuf.FieldMask field-mask]
    (-> this (.updateInstance instance field-mask))))

(defn partition-query
  "request - `com.google.spanner.v1.PartitionQueryRequest`
  options - `java.util.Map`

  returns: `com.google.spanner.v1.PartitionResponse`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.spanner.v1.PartitionResponse [^SpannerRpc this ^com.google.spanner.v1.PartitionQueryRequest request ^java.util.Map options]
    (-> this (.partitionQuery request options))))

(defn list-instance-configs
  "page-size - `int`
  page-token - `java.lang.String`

  returns: `com.google.cloud.spanner.spi.v1.SpannerRpc$Paginated<com.google.spanner.admin.instance.v1.InstanceConfig>`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.cloud.spanner.spi.v1.SpannerRpc$Paginated [^SpannerRpc this ^Integer page-size ^java.lang.String page-token]
    (-> this (.listInstanceConfigs page-size page-token))))

(defn partition-read
  "request - `com.google.spanner.v1.PartitionReadRequest`
  options - `java.util.Map`

  returns: `com.google.spanner.v1.PartitionResponse`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.spanner.v1.PartitionResponse [^SpannerRpc this ^com.google.spanner.v1.PartitionReadRequest request ^java.util.Map options]
    (-> this (.partitionRead request options))))

(defn rollback
  "request - `com.google.spanner.v1.RollbackRequest`
  options - `java.util.Map`

  throws: com.google.cloud.spanner.SpannerException"
  ([^SpannerRpc this ^com.google.spanner.v1.RollbackRequest request ^java.util.Map options]
    (-> this (.rollback request options))))

(defn begin-transaction
  "request - `com.google.spanner.v1.BeginTransactionRequest`
  options - `java.util.Map`

  returns: `com.google.spanner.v1.Transaction`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.spanner.v1.Transaction [^SpannerRpc this ^com.google.spanner.v1.BeginTransactionRequest request ^java.util.Map options]
    (-> this (.beginTransaction request options))))

(defn get-database-ddl
  "database-name - `java.lang.String`

  returns: `java.util.List<java.lang.String>`

  throws: com.google.cloud.spanner.SpannerException"
  (^java.util.List [^SpannerRpc this ^java.lang.String database-name]
    (-> this (.getDatabaseDdl database-name))))

(defn get-operation
  "Retrieves a long running operation.

  name - `java.lang.String`

  returns: `com.google.longrunning.Operation`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.longrunning.Operation [^SpannerRpc this ^java.lang.String name]
    (-> this (.getOperation name))))

(defn drop-database
  "database-name - `java.lang.String`

  throws: com.google.cloud.spanner.SpannerException"
  ([^SpannerRpc this ^java.lang.String database-name]
    (-> this (.dropDatabase database-name))))

(defn create-database
  "instance-name - `java.lang.String`
  create-database-statement - `java.lang.String`
  additional-statements - `java.lang.Iterable`

  returns: `com.google.api.gax.longrunning.OperationFuture<com.google.spanner.admin.database.v1.Database,com.google.spanner.admin.database.v1.CreateDatabaseMetadata>`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.api.gax.longrunning.OperationFuture [^SpannerRpc this ^java.lang.String instance-name ^java.lang.String create-database-statement ^java.lang.Iterable additional-statements]
    (-> this (.createDatabase instance-name create-database-statement additional-statements))))

(defn execute-query
  "request - `com.google.spanner.v1.ExecuteSqlRequest`
  consumer - `com.google.cloud.spanner.spi.v1.SpannerRpc$ResultStreamConsumer`
  options - `java.util.Map`

  returns: `com.google.cloud.spanner.spi.v1.SpannerRpc$StreamingCall`"
  (^com.google.cloud.spanner.spi.v1.SpannerRpc$StreamingCall [^SpannerRpc this ^com.google.spanner.v1.ExecuteSqlRequest request ^com.google.cloud.spanner.spi.v1.SpannerRpc$ResultStreamConsumer consumer ^java.util.Map options]
    (-> this (.executeQuery request consumer options)))
  (^com.google.spanner.v1.ResultSet [^SpannerRpc this ^com.google.spanner.v1.ExecuteSqlRequest request ^java.util.Map options]
    (-> this (.executeQuery request options))))

