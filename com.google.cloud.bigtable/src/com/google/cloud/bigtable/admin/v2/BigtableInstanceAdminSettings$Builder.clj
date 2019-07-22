(ns com.google.cloud.bigtable.admin.v2.BigtableInstanceAdminSettings$Builder
  "Builder for BigtableInstanceAdminSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2 BigtableInstanceAdminSettings$Builder]))

(defn set-project-id
  "Sets the ID of the project whose instances the client will manage.

  project-id - `java.lang.String`

  returns: `com.google.cloud.bigtable.admin.v2.BigtableInstanceAdminSettings$Builder`"
  (^com.google.cloud.bigtable.admin.v2.BigtableInstanceAdminSettings$Builder [^BigtableInstanceAdminSettings$Builder this ^java.lang.String project-id]
    (-> this (.setProjectId project-id))))

(defn get-project-id
  "Gets the ID of the project whose instances the client will manage.

  returns: `java.lang.String`"
  (^java.lang.String [^BigtableInstanceAdminSettings$Builder this]
    (-> this (.getProjectId))))

(defn set-credentials-provider
  "Sets the CredentialsProvider to use for getting the credentials to make calls with.

  credentials-provider - `com.google.api.gax.core.CredentialsProvider`

  returns: `com.google.cloud.bigtable.admin.v2.BigtableInstanceAdminSettings$Builder`"
  (^com.google.cloud.bigtable.admin.v2.BigtableInstanceAdminSettings$Builder [^BigtableInstanceAdminSettings$Builder this ^com.google.api.gax.core.CredentialsProvider credentials-provider]
    (-> this (.setCredentialsProvider credentials-provider))))

(defn get-credentials-provider
  "Gets the CredentialsProvider to use for getting the credentials to make calls with.

  returns: `com.google.api.gax.core.CredentialsProvider`"
  (^com.google.api.gax.core.CredentialsProvider [^BigtableInstanceAdminSettings$Builder this]
    (-> this (.getCredentialsProvider))))

(defn stub-settings
  "Returns the builder for the settings used for all RPCs.

   This is meant for advanced usage. The default RPC settings are set to their recommended
   values.

  returns: `com.google.cloud.bigtable.admin.v2.stub.BigtableInstanceAdminStubSettings$Builder`"
  (^com.google.cloud.bigtable.admin.v2.stub.BigtableInstanceAdminStubSettings$Builder [^BigtableInstanceAdminSettings$Builder this]
    (-> this (.stubSettings))))

(defn build
  "Builds an instance of the settings.

  returns: `com.google.cloud.bigtable.admin.v2.BigtableInstanceAdminSettings`

  throws: java.io.IOException"
  (^com.google.cloud.bigtable.admin.v2.BigtableInstanceAdminSettings [^BigtableInstanceAdminSettings$Builder this]
    (-> this (.build))))

