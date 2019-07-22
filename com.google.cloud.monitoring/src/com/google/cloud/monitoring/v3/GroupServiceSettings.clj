(ns com.google.cloud.monitoring.v3.GroupServiceSettings
  "Settings class to configure an instance of GroupServiceClient.

  The default instance has everything set to sensible defaults:


    The default service address (monitoring.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getGroup to 30 seconds:



  GroupServiceSettings.Builder groupServiceSettingsBuilder =
      GroupServiceSettings.newBuilder();
  groupServiceSettingsBuilder.getGroupSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  GroupServiceSettings groupServiceSettings = groupServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3 GroupServiceSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (GroupServiceSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (GroupServiceSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (GroupServiceSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.monitoring.v3.GroupServiceSettings$Builder`"
  (^com.google.cloud.monitoring.v3.GroupServiceSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (GroupServiceSettings/newBuilder client-context))
  (^com.google.cloud.monitoring.v3.GroupServiceSettings$Builder []
    (GroupServiceSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (GroupServiceSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.monitoring.v3.stub.GroupServiceStubSettings`

  returns: `com.google.cloud.monitoring.v3.GroupServiceSettings`

  throws: java.io.IOException"
  (^com.google.cloud.monitoring.v3.GroupServiceSettings [^com.google.cloud.monitoring.v3.stub.GroupServiceStubSettings stub]
    (GroupServiceSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (GroupServiceSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (GroupServiceSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (GroupServiceSettings/getDefaultServiceScopes )))

(defn list-groups-settings
  "Returns the object with the settings used for calls to listGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.monitoring.v3.ListGroupsRequest,com.google.monitoring.v3.ListGroupsResponse,com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^GroupServiceSettings this]
    (-> this (.listGroupsSettings))))

(defn get-group-settings
  "Returns the object with the settings used for calls to getGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.GetGroupRequest,com.google.monitoring.v3.Group>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GroupServiceSettings this]
    (-> this (.getGroupSettings))))

(defn create-group-settings
  "Returns the object with the settings used for calls to createGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.CreateGroupRequest,com.google.monitoring.v3.Group>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GroupServiceSettings this]
    (-> this (.createGroupSettings))))

(defn update-group-settings
  "Returns the object with the settings used for calls to updateGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.UpdateGroupRequest,com.google.monitoring.v3.Group>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GroupServiceSettings this]
    (-> this (.updateGroupSettings))))

(defn delete-group-settings
  "Returns the object with the settings used for calls to deleteGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.DeleteGroupRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GroupServiceSettings this]
    (-> this (.deleteGroupSettings))))

(defn list-group-members-settings
  "Returns the object with the settings used for calls to listGroupMembers.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.monitoring.v3.ListGroupMembersRequest,com.google.monitoring.v3.ListGroupMembersResponse,com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupMembersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^GroupServiceSettings this]
    (-> this (.listGroupMembersSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.monitoring.v3.GroupServiceSettings$Builder`"
  (^com.google.cloud.monitoring.v3.GroupServiceSettings$Builder [^GroupServiceSettings this]
    (-> this (.toBuilder))))

