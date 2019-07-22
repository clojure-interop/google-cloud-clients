(ns com.google.cloud.compute.v1.stub.TargetInstanceStubSettings
  "Settings class to configure an instance of TargetInstanceStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of deleteTargetInstance to 30 seconds:



  TargetInstanceStubSettings.Builder targetInstanceSettingsBuilder =
      TargetInstanceStubSettings.newBuilder();
  targetInstanceSettingsBuilder.deleteTargetInstanceSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  TargetInstanceStubSettings targetInstanceSettings = targetInstanceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub TargetInstanceStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (TargetInstanceStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (TargetInstanceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (TargetInstanceStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (TargetInstanceStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.TargetInstanceStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.TargetInstanceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (TargetInstanceStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.TargetInstanceStubSettings$Builder []
    (TargetInstanceStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (TargetInstanceStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (TargetInstanceStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (TargetInstanceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (TargetInstanceStubSettings/getDefaultServiceScopes )))

(defn aggregated-list-target-instances-settings
  "Returns the object with the settings used for calls to aggregatedListTargetInstances.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListTargetInstancesHttpRequest,com.google.cloud.compute.v1.TargetInstanceAggregatedList,com.google.cloud.compute.v1.TargetInstanceClient$AggregatedListTargetInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^TargetInstanceStubSettings this]
    (-> this (.aggregatedListTargetInstancesSettings))))

(defn delete-target-instance-settings
  "Returns the object with the settings used for calls to deleteTargetInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.DeleteTargetInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetInstanceStubSettings this]
    (-> this (.deleteTargetInstanceSettings))))

(defn get-target-instance-settings
  "Returns the object with the settings used for calls to getTargetInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetTargetInstanceHttpRequest,com.google.cloud.compute.v1.TargetInstance>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetInstanceStubSettings this]
    (-> this (.getTargetInstanceSettings))))

(defn insert-target-instance-settings
  "Returns the object with the settings used for calls to insertTargetInstance.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertTargetInstanceHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^TargetInstanceStubSettings this]
    (-> this (.insertTargetInstanceSettings))))

(defn list-target-instances-settings
  "Returns the object with the settings used for calls to listTargetInstances.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListTargetInstancesHttpRequest,com.google.cloud.compute.v1.TargetInstanceList,com.google.cloud.compute.v1.TargetInstanceClient$ListTargetInstancesPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^TargetInstanceStubSettings this]
    (-> this (.listTargetInstancesSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.TargetInstanceStub`

  throws: java.io.IOException"
  ([^TargetInstanceStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.TargetInstanceStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.TargetInstanceStubSettings$Builder [^TargetInstanceStubSettings this]
    (-> this (.toBuilder))))

