(ns com.google.cloud.bigtable.admin.v2.BigtableInstanceAdminSettings
  "Settings class to configure an instance of BigtableInstanceAdminClient.

  It must be configured with a project ID and can be used to change default RPC settings.

  Example usage:



  BigtableInstanceAdminSettings.Builder settingsBuilder = BigtableInstanceAdminSettings.newBuilder()
   .setProjectId(\"my-project\");

  settingsBuilder.stubSettings().createInstanceSettings()
    .setRetrySettings(
      RetrySettings.newBuilder()
        .setTotalTimeout(Duration.ofMinutes(15))
        .build());

  BigtableInstanceAdminSettings settings = settingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2 BigtableInstanceAdminSettings]))

(defn *new-builder
  "Returns a new builder for this class.

  returns: `com.google.cloud.bigtable.admin.v2.BigtableInstanceAdminSettings$Builder`"
  (^com.google.cloud.bigtable.admin.v2.BigtableInstanceAdminSettings$Builder []
    (BigtableInstanceAdminSettings/newBuilder )))

(defn get-project-id
  "Gets the ID of the project whose instances the client will manage.

  returns: `java.lang.String`"
  (^java.lang.String [^BigtableInstanceAdminSettings this]
    (-> this (.getProjectId))))

(defn get-credentials-provider
  "Gets the credentials provider to use for getting the credentials to make calls with.

  returns: `com.google.api.gax.core.CredentialsProvider`"
  (^com.google.api.gax.core.CredentialsProvider [^BigtableInstanceAdminSettings this]
    (-> this (.getCredentialsProvider))))

(defn get-stub-settings
  "Gets the underlying RPC settings.

  returns: `com.google.cloud.bigtable.admin.v2.stub.BigtableInstanceAdminStubSettings`"
  (^com.google.cloud.bigtable.admin.v2.stub.BigtableInstanceAdminStubSettings [^BigtableInstanceAdminSettings this]
    (-> this (.getStubSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.bigtable.admin.v2.BigtableInstanceAdminSettings$Builder`"
  (^com.google.cloud.bigtable.admin.v2.BigtableInstanceAdminSettings$Builder [^BigtableInstanceAdminSettings this]
    (-> this (.toBuilder))))

