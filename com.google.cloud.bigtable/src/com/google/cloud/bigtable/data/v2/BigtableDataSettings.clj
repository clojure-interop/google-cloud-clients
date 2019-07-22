(ns com.google.cloud.bigtable.data.v2.BigtableDataSettings
  "Settings class to configure an instance of BigtableDataClient.

  Sane defaults are provided for most settings:


    The default service address (bigtable.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The only required setting is the instance name.

  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object.



  BigtableDataSettings.Builder settingsBuilder = BigtableDataSettings.newBuilder()
    .setProjectId(\"my-project\")
    .setInstanceId(\"my-instance-id\")
    .setAppProfileId(\"default\");

  BigtableDataSettings settings = builder.build();

  For fine grained control of individual RPCs, please refer to EnhancedBigtableStubSettings, which is exposed as BigtableDataSettings.Builder.stubSettings()."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.data.v2 BigtableDataSettings]))

(defn *new-builder
  "Create a new builder.

  returns: `com.google.cloud.bigtable.data.v2.BigtableDataSettings$Builder`"
  (^com.google.cloud.bigtable.data.v2.BigtableDataSettings$Builder []
    (BigtableDataSettings/newBuilder )))

(defn *new-builder-for-emulator
  "Create a new builder preconfigured to connect to the Bigtable emulator.

  port - `int`

  returns: `com.google.cloud.bigtable.data.v2.BigtableDataSettings$Builder`"
  (^com.google.cloud.bigtable.data.v2.BigtableDataSettings$Builder [^Integer port]
    (BigtableDataSettings/newBuilderForEmulator port)))

(defn get-project-id
  "Returns the target project id.

  returns: `java.lang.String`"
  (^java.lang.String [^BigtableDataSettings this]
    (-> this (.getProjectId))))

(defn get-instance-id
  "Returns the target instance id.

  returns: `java.lang.String`"
  (^java.lang.String [^BigtableDataSettings this]
    (-> this (.getInstanceId))))

(defn get-app-profile-id
  "Returns the configured AppProfile id to use.

  returns: `java.lang.String`"
  (^java.lang.String [^BigtableDataSettings this]
    (-> this (.getAppProfileId))))

(defn get-stub-settings
  "Returns the underlying RPC settings.

  returns: `com.google.cloud.bigtable.data.v2.stub.EnhancedBigtableStubSettings`"
  (^com.google.cloud.bigtable.data.v2.stub.EnhancedBigtableStubSettings [^BigtableDataSettings this]
    (-> this (.getStubSettings))))

(defn read-row-settings
  "Returns the object with the settings used for point reads via ReadRow.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.bigtable.data.v2.models.Query,com.google.cloud.bigtable.data.v2.models.Row>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^BigtableDataSettings this]
    (-> this (.readRowSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.bigtable.data.v2.BigtableDataSettings$Builder`"
  (^com.google.cloud.bigtable.data.v2.BigtableDataSettings$Builder [^BigtableDataSettings this]
    (-> this (.toBuilder))))

