(ns com.google.cloud.dataproc.v1.ClusterControllerSettings
  "Settings class to configure an instance of ClusterControllerClient.

  The default instance has everything set to sensible defaults:


    The default service address (dataproc.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getCluster to 30 seconds:



  ClusterControllerSettings.Builder clusterControllerSettingsBuilder =
      ClusterControllerSettings.newBuilder();
  clusterControllerSettingsBuilder.getClusterSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  ClusterControllerSettings clusterControllerSettings = clusterControllerSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.dataproc.v1 ClusterControllerSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (ClusterControllerSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (ClusterControllerSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (ClusterControllerSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.dataproc.v1.ClusterControllerSettings$Builder`"
  (^com.google.cloud.dataproc.v1.ClusterControllerSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (ClusterControllerSettings/newBuilder client-context))
  (^com.google.cloud.dataproc.v1.ClusterControllerSettings$Builder []
    (ClusterControllerSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (ClusterControllerSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.dataproc.v1.stub.ClusterControllerStubSettings`

  returns: `com.google.cloud.dataproc.v1.ClusterControllerSettings`

  throws: java.io.IOException"
  (^com.google.cloud.dataproc.v1.ClusterControllerSettings [^com.google.cloud.dataproc.v1.stub.ClusterControllerStubSettings stub]
    (ClusterControllerSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (ClusterControllerSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (ClusterControllerSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (ClusterControllerSettings/getDefaultServiceScopes )))

(defn create-cluster-operation-settings
  "Returns the object with the settings used for calls to createCluster.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dataproc.v1.CreateClusterRequest,com.google.cloud.dataproc.v1.Cluster,com.google.cloud.dataproc.v1.ClusterOperationMetadata>`"
  ([^ClusterControllerSettings this]
    (-> this (.createClusterOperationSettings))))

(defn delete-cluster-operation-settings
  "Returns the object with the settings used for calls to deleteCluster.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dataproc.v1.DeleteClusterRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1.ClusterOperationMetadata>`"
  ([^ClusterControllerSettings this]
    (-> this (.deleteClusterOperationSettings))))

(defn update-cluster-settings
  "Returns the object with the settings used for calls to updateCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1.UpdateClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterControllerSettings this]
    (-> this (.updateClusterSettings))))

(defn diagnose-cluster-operation-settings
  "Returns the object with the settings used for calls to diagnoseCluster.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dataproc.v1.DiagnoseClusterRequest,com.google.protobuf.Empty,com.google.cloud.dataproc.v1.DiagnoseClusterResults>`"
  ([^ClusterControllerSettings this]
    (-> this (.diagnoseClusterOperationSettings))))

(defn delete-cluster-settings
  "Returns the object with the settings used for calls to deleteCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1.DeleteClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterControllerSettings this]
    (-> this (.deleteClusterSettings))))

(defn update-cluster-operation-settings
  "Returns the object with the settings used for calls to updateCluster.

  returns: `(value="The surface for long-running operations is not stable yet and may change in the future.")  com.google.api.gax.rpc.OperationCallSettings<com.google.cloud.dataproc.v1.UpdateClusterRequest,com.google.cloud.dataproc.v1.Cluster,com.google.cloud.dataproc.v1.ClusterOperationMetadata>`"
  ([^ClusterControllerSettings this]
    (-> this (.updateClusterOperationSettings))))

(defn diagnose-cluster-settings
  "Returns the object with the settings used for calls to diagnoseCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1.DiagnoseClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterControllerSettings this]
    (-> this (.diagnoseClusterSettings))))

(defn list-clusters-settings
  "Returns the object with the settings used for calls to listClusters.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.cloud.dataproc.v1.ListClustersRequest,com.google.cloud.dataproc.v1.ListClustersResponse,com.google.cloud.dataproc.v1.ClusterControllerClient$ListClustersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^ClusterControllerSettings this]
    (-> this (.listClustersSettings))))

(defn create-cluster-settings
  "Returns the object with the settings used for calls to createCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1.CreateClusterRequest,com.google.longrunning.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterControllerSettings this]
    (-> this (.createClusterSettings))))

(defn get-cluster-settings
  "Returns the object with the settings used for calls to getCluster.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.cloud.dataproc.v1.GetClusterRequest,com.google.cloud.dataproc.v1.Cluster>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^ClusterControllerSettings this]
    (-> this (.getClusterSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.dataproc.v1.ClusterControllerSettings$Builder`"
  (^com.google.cloud.dataproc.v1.ClusterControllerSettings$Builder [^ClusterControllerSettings this]
    (-> this (.toBuilder))))

