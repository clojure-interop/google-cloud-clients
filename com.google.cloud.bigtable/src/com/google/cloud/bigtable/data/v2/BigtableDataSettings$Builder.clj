(ns com.google.cloud.bigtable.data.v2.BigtableDataSettings$Builder
  "Builder for BigtableDataSettings."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2 BigtableDataSettings$Builder]))

(defn get-project-id
  "Gets the project id that was previously set on this Builder.

  returns: `java.lang.String`"
  (^java.lang.String [^BigtableDataSettings$Builder this]
    (-> this (.getProjectId))))

(defn get-credentials-provider
  "Gets the CredentialsProvider to use for getting the credentials to make calls with.

  returns: `com.google.api.gax.core.CredentialsProvider`"
  (^com.google.api.gax.core.CredentialsProvider [^BigtableDataSettings$Builder this]
    (-> this (.getCredentialsProvider))))

(defn set-credentials-provider
  "Sets the CredentialsProvider to use for getting the credentials to make calls with.

  credentials-provider - `com.google.api.gax.core.CredentialsProvider`

  returns: `com.google.cloud.bigtable.data.v2.BigtableDataSettings$Builder`"
  (^com.google.cloud.bigtable.data.v2.BigtableDataSettings$Builder [^BigtableDataSettings$Builder this ^com.google.api.gax.core.CredentialsProvider credentials-provider]
    (-> this (.setCredentialsProvider credentials-provider))))

(defn get-app-profile-id
  "Gets the app profile id that was previously set on this Builder.

  returns: `java.lang.String`"
  (^java.lang.String [^BigtableDataSettings$Builder this]
    (-> this (.getAppProfileId))))

(defn set-project-id
  "Sets the target project. This setting is required. All RPCs will be made in the context of
   this setting.

  project-id - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.BigtableDataSettings$Builder`"
  (^com.google.cloud.bigtable.data.v2.BigtableDataSettings$Builder [^BigtableDataSettings$Builder this ^java.lang.String project-id]
    (-> this (.setProjectId project-id))))

(defn stub-settings
  "Returns the underlying settings for making RPC calls. The settings should be changed with
   care.

  returns: `com.google.cloud.bigtable.data.v2.stub.EnhancedBigtableStubSettings$Builder`"
  (^com.google.cloud.bigtable.data.v2.stub.EnhancedBigtableStubSettings$Builder [^BigtableDataSettings$Builder this]
    (-> this (.stubSettings))))

(defn set-instance-id
  "Sets the target instance. This setting is required. All RPCs will be made in the context of
   this setting.

  instance-id - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.BigtableDataSettings$Builder`"
  (^com.google.cloud.bigtable.data.v2.BigtableDataSettings$Builder [^BigtableDataSettings$Builder this ^java.lang.String instance-id]
    (-> this (.setInstanceId instance-id))))

(defn build
  "returns: `com.google.cloud.bigtable.data.v2.BigtableDataSettings`"
  (^com.google.cloud.bigtable.data.v2.BigtableDataSettings [^BigtableDataSettings$Builder this]
    (-> this (.build))))

(defn set-app-profile-id
  "Sets the AppProfile to use. An application profile (sometimes also shortened to \"app
   profile\") is a group of configuration parameters for an individual use case. A client will
   identify itself with an application profile ID at connection time, and the requests will be
   handled according to that application profile.

  app-profile-id - `java.lang.String`

  returns: `com.google.cloud.bigtable.data.v2.BigtableDataSettings$Builder`"
  (^com.google.cloud.bigtable.data.v2.BigtableDataSettings$Builder [^BigtableDataSettings$Builder this ^java.lang.String app-profile-id]
    (-> this (.setAppProfileId app-profile-id))))

(defn get-instance-id
  "Gets the instance id that was previously set on this Builder.

  returns: `java.lang.String`"
  (^java.lang.String [^BigtableDataSettings$Builder this]
    (-> this (.getInstanceId))))

