(ns com.google.cloud.compute.v1.MachineTypeSettings
  "Settings class to configure an instance of MachineTypeClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getMachineType to 30 seconds:



  MachineTypeSettings.Builder machineTypeSettingsBuilder =
      MachineTypeSettings.newBuilder();
  machineTypeSettingsBuilder.getMachineTypeSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  MachineTypeSettings machineTypeSettings = machineTypeSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 MachineTypeSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (MachineTypeSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (MachineTypeSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (MachineTypeSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (MachineTypeSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.MachineTypeSettings$Builder`"
  (^com.google.cloud.compute.v1.MachineTypeSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (MachineTypeSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.MachineTypeSettings$Builder []
    (MachineTypeSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (MachineTypeSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (MachineTypeSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.MachineTypeStubSettings`

  returns: `com.google.cloud.compute.v1.MachineTypeSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.MachineTypeSettings [^com.google.cloud.compute.v1.stub.MachineTypeStubSettings stub]
    (MachineTypeSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (MachineTypeSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (MachineTypeSettings/getDefaultServiceScopes )))

(defn aggregated-list-machine-types-settings
  "Returns the object with the settings used for calls to aggregatedListMachineTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListMachineTypesHttpRequest,com.google.cloud.compute.v1.MachineTypeAggregatedList,com.google.cloud.compute.v1.MachineTypeClient$AggregatedListMachineTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^MachineTypeSettings this]
    (-> this (.aggregatedListMachineTypesSettings))))

(defn get-machine-type-settings
  "Returns the object with the settings used for calls to getMachineType.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetMachineTypeHttpRequest,com.google.cloud.compute.v1.MachineType>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^MachineTypeSettings this]
    (-> this (.getMachineTypeSettings))))

(defn list-machine-types-settings
  "Returns the object with the settings used for calls to listMachineTypes.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListMachineTypesHttpRequest,com.google.cloud.compute.v1.MachineTypeList,com.google.cloud.compute.v1.MachineTypeClient$ListMachineTypesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^MachineTypeSettings this]
    (-> this (.listMachineTypesSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.MachineTypeSettings$Builder`"
  (^com.google.cloud.compute.v1.MachineTypeSettings$Builder [^MachineTypeSettings this]
    (-> this (.toBuilder))))

