(ns com.google.cloud.compute.v1.RegionCommitmentSettings
  "Settings class to configure an instance of RegionCommitmentClient.

  The default instance has everything set to sensible defaults:


    The default service address (https://www.googleapis.com/compute/v1/projects/) and default
        port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getRegionCommitment to 30 seconds:



  RegionCommitmentSettings.Builder regionCommitmentSettingsBuilder =
      RegionCommitmentSettings.newBuilder();
  regionCommitmentSettingsBuilder.getRegionCommitmentSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  RegionCommitmentSettings regionCommitmentSettings = regionCommitmentSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RegionCommitmentSettings]))

(defn *default-http-json-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder`"
  (^com.google.api.gax.httpjson.InstantiatingHttpJsonChannelProvider.Builder []
    (RegionCommitmentSettings/defaultHttpJsonTransportProviderBuilder )))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (RegionCommitmentSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (RegionCommitmentSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (RegionCommitmentSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.compute.v1.RegionCommitmentSettings$Builder`"
  (^com.google.cloud.compute.v1.RegionCommitmentSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (RegionCommitmentSettings/newBuilder client-context))
  (^com.google.cloud.compute.v1.RegionCommitmentSettings$Builder []
    (RegionCommitmentSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (RegionCommitmentSettings/defaultCredentialsProviderBuilder )))

(defn *get-default-service-port
  "Returns the default service port.

  returns: `int`"
  (^Integer []
    (RegionCommitmentSettings/getDefaultServicePort )))

(defn *create
  "stub - `com.google.cloud.compute.v1.stub.RegionCommitmentStubSettings`

  returns: `com.google.cloud.compute.v1.RegionCommitmentSettings`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.RegionCommitmentSettings [^com.google.cloud.compute.v1.stub.RegionCommitmentStubSettings stub]
    (RegionCommitmentSettings/create stub)))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (RegionCommitmentSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (RegionCommitmentSettings/getDefaultServiceScopes )))

(defn aggregated-list-region-commitments-settings
  "Returns the object with the settings used for calls to aggregatedListRegionCommitments.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.AggregatedListRegionCommitmentsHttpRequest,com.google.cloud.compute.v1.CommitmentAggregatedList,com.google.cloud.compute.v1.RegionCommitmentClient$AggregatedListRegionCommitmentsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RegionCommitmentSettings this]
    (-> this (.aggregatedListRegionCommitmentsSettings))))

(defn get-region-commitment-settings
  "Returns the object with the settings used for calls to getRegionCommitment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.GetRegionCommitmentHttpRequest,com.google.cloud.compute.v1.Commitment>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionCommitmentSettings this]
    (-> this (.getRegionCommitmentSettings))))

(defn insert-region-commitment-settings
  "Returns the object with the settings used for calls to insertRegionCommitment.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.compute.v1.InsertRegionCommitmentHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^RegionCommitmentSettings this]
    (-> this (.insertRegionCommitmentSettings))))

(defn list-region-commitments-settings
  "Returns the object with the settings used for calls to listRegionCommitments.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.compute.v1.ListRegionCommitmentsHttpRequest,com.google.cloud.compute.v1.CommitmentList,com.google.cloud.compute.v1.RegionCommitmentClient$ListRegionCommitmentsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^RegionCommitmentSettings this]
    (-> this (.listRegionCommitmentsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.compute.v1.RegionCommitmentSettings$Builder`"
  (^com.google.cloud.compute.v1.RegionCommitmentSettings$Builder [^RegionCommitmentSettings this]
    (-> this (.toBuilder))))

