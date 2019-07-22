(ns com.google.cloud.spanner.Spanner
  "An interface for Cloud Spanner. Typically, there would only be one instance of this for the
  lifetime of the application which must be closed by invoking close() when it is no
  longer needed. Failure to do so may result in leaking session resources and exhausting session
  quota."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner Spanner]))

(defn get-database-admin-client
  "Returns a DatabaseAdminClient to do admin operations on Cloud Spanner databases.

  returns: `com.google.cloud.spanner.DatabaseAdminClient`"
  (^com.google.cloud.spanner.DatabaseAdminClient [^Spanner this]
    (-> this (.getDatabaseAdminClient))))

(defn get-instance-admin-client
  "Returns an InstanceAdminClient to do admin operations on Cloud Spanner instances.

  returns: `com.google.cloud.spanner.InstanceAdminClient`"
  (^com.google.cloud.spanner.InstanceAdminClient [^Spanner this]
    (-> this (.getInstanceAdminClient))))

(defn get-database-client
  "Returns a DatabaseClient for the given database. It uses a pool of sessions to talk to
   the database.
   SNIPPET get_db_client



   SpannerOptions options = SpannerOptions.newBuilder().build();
   Spanner spanner = options.getService();
   final String project = \"test-project\";
   final String instance = \"test-instance\";
   final String database = \"example-db\";
   DatabaseId db =
       DatabaseId.of(project, instance, database);
   DatabaseClient dbClient = spanner.getDatabaseClient(db);

   SNIPPET get_db_client

  db - `com.google.cloud.spanner.DatabaseId`

  returns: `com.google.cloud.spanner.DatabaseClient`"
  (^com.google.cloud.spanner.DatabaseClient [^Spanner this ^com.google.cloud.spanner.DatabaseId db]
    (-> this (.getDatabaseClient db))))

(defn get-batch-client
  "Returns a BatchClient to do batch operations on Cloud Spanner databases. Batch client
   is useful when one wants to read/query a large amount of data from Cloud Spanner across
   multiple processes, even across different machines. It allows to create partitions of Cloud
   Spanner database and then read/query over each partition independently yet at the same
   snapshot.

   For all other use cases, DatabaseClient is more appropriate and performant.
   SNIPPET get_batch_client



   SpannerOptions options = SpannerOptions.newBuilder().build();
   Spanner spanner = options.getService();
   final String project = \"test-project\";
   final String instance = \"test-instance\";
   final String database = \"example-db\";
   DatabaseId db =
       DatabaseId.of(project, instance, database);
   BatchClient batchClient = spanner.getBatchClient(db);

   SNIPPET get_batch_client

  db - `com.google.cloud.spanner.DatabaseId`

  returns: `com.google.cloud.spanner.BatchClient`"
  (^com.google.cloud.spanner.BatchClient [^Spanner this ^com.google.cloud.spanner.DatabaseId db]
    (-> this (.getBatchClient db))))

(defn close
  "Closes all the clients associated with this instance and frees up all the resources. This
   method will block until it can clean up all the resources. Specifically, it deletes all the
   underlying sessions (which involves rpcs) and closes all the gRPC channels. Once this method
   called, this object is no longer usable. It is strongly advised to call this method when you
   are done with the Spanner object, typically when your application shuts down. There is
   a hard limit on number of sessions in Cloud Spanner and not calling this method can lead to
   unused sessions piling up on the backend."
  ([^Spanner this]
    (-> this (.close))))

(defn closed?
  "returns: true if this Spanner object is closed. - `boolean`"
  (^Boolean [^Spanner this]
    (-> this (.isClosed))))

