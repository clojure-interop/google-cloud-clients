(ns com.google.cloud.spanner.testing.RemoteSpannerHelper
  "Utility that provides access to a Cloud Spanner instance to use for tests, and allows uniquely
  named test databases to be created within that instance."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.spanner.testing RemoteSpannerHelper]))

(defn *create
  "Creates a RemoteSpannerHelper for the given option and bound to the given instance ID.
   All databases created using this will be created in the given instance.

  options - `com.google.cloud.spanner.SpannerOptions`
  instance-id - `com.google.cloud.spanner.InstanceId`

  returns: `com.google.cloud.spanner.testing.RemoteSpannerHelper`

  throws: java.lang.Throwable"
  (^com.google.cloud.spanner.testing.RemoteSpannerHelper [^com.google.cloud.spanner.SpannerOptions options ^com.google.cloud.spanner.InstanceId instance-id]
    (RemoteSpannerHelper/create options instance-id))
  (^com.google.cloud.spanner.testing.RemoteSpannerHelper [^com.google.cloud.spanner.InstanceId instance-id]
    (RemoteSpannerHelper/create instance-id)))

(defn get-options
  "returns: `com.google.cloud.spanner.SpannerOptions`"
  (^com.google.cloud.spanner.SpannerOptions [^RemoteSpannerHelper this]
    (-> this (.getOptions))))

(defn get-client
  "returns: `com.google.cloud.spanner.Spanner`"
  (^com.google.cloud.spanner.Spanner [^RemoteSpannerHelper this]
    (-> this (.getClient))))

(defn get-database-client
  "db - `com.google.cloud.spanner.Database`

  returns: `com.google.cloud.spanner.DatabaseClient`"
  (^com.google.cloud.spanner.DatabaseClient [^RemoteSpannerHelper this ^com.google.cloud.spanner.Database db]
    (-> this (.getDatabaseClient db))))

(defn get-batch-client
  "db - `com.google.cloud.spanner.Database`

  returns: `com.google.cloud.spanner.BatchClient`"
  (^com.google.cloud.spanner.BatchClient [^RemoteSpannerHelper this ^com.google.cloud.spanner.Database db]
    (-> this (.getBatchClient db))))

(defn get-instance-id
  "returns: `com.google.cloud.spanner.InstanceId`"
  (^com.google.cloud.spanner.InstanceId [^RemoteSpannerHelper this]
    (-> this (.getInstanceId))))

(defn create-test-database
  "Creates a test database defined by statements. A CREATE DATABASE ... statement
   should not be included; an appropriate name will be chosen and the statement generated
   accordingly.

  statements - `java.lang.String`

  returns: `com.google.cloud.spanner.Database`

  throws: com.google.cloud.spanner.SpannerException"
  (^com.google.cloud.spanner.Database [^RemoteSpannerHelper this ^java.lang.String statements]
    (-> this (.createTestDatabase statements))))

(defn get-unique-database-id
  "Returns a database id which is guaranteed to be unique within the context of this environment.

  returns: `java.lang.String`"
  (^java.lang.String [^RemoteSpannerHelper this]
    (-> this (.getUniqueDatabaseId))))

(defn clean-up
  "Deletes all the databases created via createTestDatabase. Shuts down the client."
  ([^RemoteSpannerHelper this]
    (-> this (.cleanUp))))

