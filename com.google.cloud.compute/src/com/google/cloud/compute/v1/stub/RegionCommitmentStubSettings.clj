(ns com.google.cloud.compute.v1.stub.RegionCommitmentStubSettings
  "Settings class to configure an instance of RegionCommitmentStub.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getRegionCommitment to 30 seconds:



  RegionCommitmentStubSettings.Builder regionCommitmentSettingsBuilder =
      RegionCommitmentStubSettings.newBuilder();
  regionCommitmentSettingsBuilder.getRegionCommitmentSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  RegionCommitmentStubSettings regionCommitmentSettings = regionCommitmentSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1.stub RegionCommitmentStubSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (RegionCommitmentStubSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (RegionCommitmentStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RegionCommitmentStubSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (RegionCommitmentStubSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.stub.RegionCommitmentStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RegionCommitmentStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (RegionCommitmentStubSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.stub.RegionCommitmentStubSettings$Builder []
    (RegionCommitmentStubSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (RegionCommitmentStubSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (RegionCommitmentStubSettings/getDefaultServicePort )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (RegionCommitmentStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (RegionCommitmentStubSettings/getDefaultServiceScopes )))

(defn aggregated-list-region-commitments-settings
  "Returns the object with the settings used for calls to aggregatedListRegionCommitments.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListRegionCommitmentsHttpRequest,com.google.cloud.compute.v1.CommitmentAggregatedList,com.google.cloud.compute.v1.RegionCommitmentClient$AggregatedListRegionCommitmentsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RegionCommitmentStubSettings this]
    (-> this (.aggregatedListRegionCommitmentsSettings))))

(defn get-region-commitment-settings
  "Returns the object with the settings used for calls to getRegionCommitment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetRegionCommitmentHttpRequest,com.google.cloud.compute.v1.Commitment>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionCommitmentStubSettings this]
    (-> this (.getRegionCommitmentSettings))))

(defn insert-region-commitment-settings
  "Returns the object with the settings used for calls to insertRegionCommitment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertRegionCommitmentHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionCommitmentStubSettings this]
    (-> this (.insertRegionCommitmentSettings))))

(defn list-region-commitments-settings
  "Returns the object with the settings used for calls to listRegionCommitments.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListRegionCommitmentsHttpRequest,com.google.cloud.compute.v1.CommitmentList,com.google.cloud.compute.v1.RegionCommitmentClient$ListRegionCommitmentsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RegionCommitmentStubSettings this]
    (-> this (.listRegionCommitmentsSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.RegionCommitmentStub`

  throws: java.io.IOException"
  ([^RegionCommitmentStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.stub.RegionCommitmentStubSettings$Builder`"
  (^com.google.cloud.compute.v1.stub.RegionCommitmentStubSettings$Builder [^RegionCommitmentStubSettings this]
    (-> this (.toBuilder))))

