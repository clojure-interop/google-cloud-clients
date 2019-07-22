(ns com.google.cloud.bigtable.admin.v2.BigtableTableAdminSettings$Builder
  "Builder for BigtableTableAdminSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2 BigtableTableAdminSettings$Builder]))

(defn set-project-id
  "Sets the project ID of the instance whose tables the client will manage.

  project-id - `java.lang.String`

  returns: `com.google.cloud.bigtable.admin.v2.BigtableTableAdminSettings$Builder`"
  (^com.google.cloud.bigtable.admin.v2.BigtableTableAdminSettings$Builder [^BigtableTableAdminSettings$Builder this ^java.lang.String project-id]
    (-> this (.setProjectId project-id))))

(defn get-project-id
  "Gets the project ID of the instance whose tables the client will manage.

  returns: `java.lang.String`"
  (^java.lang.String [^BigtableTableAdminSettings$Builder this]
    (-> this (.getProjectId))))

(defn set-instance-id
  "Sets the instance ID of the instance whose tables the client will manage.

  instance-id - `java.lang.String`

  returns: `com.google.cloud.bigtable.admin.v2.BigtableTableAdminSettings$Builder`"
  (^com.google.cloud.bigtable.admin.v2.BigtableTableAdminSettings$Builder [^BigtableTableAdminSettings$Builder this ^java.lang.String instance-id]
    (-> this (.setInstanceId instance-id))))

(defn get-instance-id
  "Gets the instance ID of the instance whose tables the client will manage.

  returns: `java.lang.String`"
  (^java.lang.String [^BigtableTableAdminSettings$Builder this]
    (-> this (.getInstanceId))))

(defn set-credentials-provider
  "Sets the credentials provider to use for getting the credentials to make calls with.

  credentials-provider - `com.google.api.gax.core.CredentialsProvider`

  returns: `com.google.cloud.bigtable.admin.v2.BigtableTableAdminSettings$Builder`"
  (^com.google.cloud.bigtable.admin.v2.BigtableTableAdminSettings$Builder [^BigtableTableAdminSettings$Builder this ^com.google.api.gax.core.CredentialsProvider credentials-provider]
    (-> this (.setCredentialsProvider credentials-provider))))

(defn get-credentials-provider
  "Gets the credentials provider to use for getting the credentials to make calls with.

  returns: `com.google.api.gax.core.CredentialsProvider`"
  (^com.google.api.gax.core.CredentialsProvider [^BigtableTableAdminSettings$Builder this]
    (-> this (.getCredentialsProvider))))

(defn stub-settings
  "Returns the builder for the settings used for all RPCs.

   This is meant for advanced usage. The default RPC settings are set to their recommended
   values.

  returns: `com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStubSettings$Builder`"
  (^com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStubSettings$Builder [^BigtableTableAdminSettings$Builder this]
    (-> this (.stubSettings))))

(defn build
  "Builds an instance of the settings.

  returns: `com.google.cloud.bigtable.admin.v2.BigtableTableAdminSettings`

  throws: java.io.IOException"
  (^com.google.cloud.bigtable.admin.v2.BigtableTableAdminSettings [^BigtableTableAdminSettings$Builder this]
    (-> this (.build))))

