(ns com.google.cloud.bigtable.admin.v2.BigtableTableAdminSettings
  "Settings class to configure an instance of BigtableTableAdminClient.

  It must be configured with a project ID and instance ID.

  Example usage:



  BigtableTableAdminSettings.Builder tableAdminSettingsBuilder = BigtableTableAdminSettings.newBuilder()
    .setProjectId(\"my-project\")
    .setInstanceId(\"my-instance\");

  tableAdminSettingsBuilder.stubSettings().createTableSettings()
    .setRetrySettings(
      RetrySettings.newBuilder()
        .setTotalTimeout(Duration.ofMinutes(15))
        .build());

  BigtableTableAdminSettings tableAdminSettings = tableAdminSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2 BigtableTableAdminSettings]))

(defn *new-builder
  "Returns a new builder for this class.

  returns: `com.google.cloud.bigtable.admin.v2.BigtableTableAdminSettings$Builder`"
  (^com.google.cloud.bigtable.admin.v2.BigtableTableAdminSettings$Builder []
    (BigtableTableAdminSettings/newBuilder )))

(defn *new-builder-for-emulator
  "Create a new builder preconfigured to connect to the Bigtable emulator.

  port - `int`

  returns: `com.google.cloud.bigtable.admin.v2.BigtableTableAdminSettings$Builder`"
  (^com.google.cloud.bigtable.admin.v2.BigtableTableAdminSettings$Builder [^Integer port]
    (BigtableTableAdminSettings/newBuilderForEmulator port)))

(defn get-project-id
  "Gets the project ID of instance whose tables the client will manage.

  returns: `java.lang.String`"
  (^java.lang.String [^BigtableTableAdminSettings this]
    (-> this (.getProjectId))))

(defn get-instance-id
  "Gets the instance ID whose tables the client will manage.

  returns: `java.lang.String`"
  (^java.lang.String [^BigtableTableAdminSettings this]
    (-> this (.getInstanceId))))

(defn get-credentials-provider
  "Gets the credentials provider to use for getting the credentials to make calls with.

  returns: `com.google.api.gax.core.CredentialsProvider`"
  (^com.google.api.gax.core.CredentialsProvider [^BigtableTableAdminSettings this]
    (-> this (.getCredentialsProvider))))

(defn get-stub-settings
  "Gets the underlying RPC settings.

  returns: `com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStubSettings`"
  (^com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStubSettings [^BigtableTableAdminSettings this]
    (-> this (.getStubSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.bigtable.admin.v2.BigtableTableAdminSettings$Builder`"
  (^com.google.cloud.bigtable.admin.v2.BigtableTableAdminSettings$Builder [^BigtableTableAdminSettings this]
    (-> this (.toBuilder))))

