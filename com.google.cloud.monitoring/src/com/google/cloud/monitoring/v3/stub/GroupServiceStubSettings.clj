(ns com.google.cloud.monitoring.v3.stub.GroupServiceStubSettings
  "Settings class to configure an instance of GroupServiceStub.

  The default instance has everything set to sensible defaults:


    The default service address (monitoring.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of getGroup to 30 seconds:



  GroupServiceStubSettings.Builder groupServiceSettingsBuilder =
      GroupServiceStubSettings.newBuilder();
  groupServiceSettingsBuilder.getGroupSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  GroupServiceStubSettings groupServiceSettings = groupServiceSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3.stub GroupServiceStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (GroupServiceStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (GroupServiceStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (GroupServiceStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (GroupServiceStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (GroupServiceStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (GroupServiceStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (GroupServiceStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.monitoring.v3.stub.GroupServiceStubSettings$Builder`"
  (^com.google.cloud.monitoring.v3.stub.GroupServiceStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (GroupServiceStubSettings/newBuilder client-context))
  (^com.google.cloud.monitoring.v3.stub.GroupServiceStubSettings$Builder []
    (GroupServiceStubSettings/newBuilder )))

(defn list-groups-settings
  "Returns the object with the settings used for calls to listGroups.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.monitoring.v3.ListGroupsRequest,com.google.monitoring.v3.ListGroupsResponse,com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^GroupServiceStubSettings this]
    (-> this (.listGroupsSettings))))

(defn get-group-settings
  "Returns the object with the settings used for calls to getGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.GetGroupRequest,com.google.monitoring.v3.Group>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GroupServiceStubSettings this]
    (-> this (.getGroupSettings))))

(defn create-group-settings
  "Returns the object with the settings used for calls to createGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.CreateGroupRequest,com.google.monitoring.v3.Group>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GroupServiceStubSettings this]
    (-> this (.createGroupSettings))))

(defn update-group-settings
  "Returns the object with the settings used for calls to updateGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.UpdateGroupRequest,com.google.monitoring.v3.Group>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GroupServiceStubSettings this]
    (-> this (.updateGroupSettings))))

(defn delete-group-settings
  "Returns the object with the settings used for calls to deleteGroup.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.monitoring.v3.DeleteGroupRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^GroupServiceStubSettings this]
    (-> this (.deleteGroupSettings))))

(defn list-group-members-settings
  "Returns the object with the settings used for calls to listGroupMembers.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.monitoring.v3.ListGroupMembersRequest,com.google.monitoring.v3.ListGroupMembersResponse,com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupMembersPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^GroupServiceStubSettings this]
    (-> this (.listGroupMembersSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.monitoring.v3.stub.GroupServiceStub`

  throws: java.io.IOException"
  ([^GroupServiceStubSettings this]
    (-> this (.createStub))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.monitoring.v3.stub.GroupServiceStubSettings$Builder`"
  (^com.google.cloud.monitoring.v3.stub.GroupServiceStubSettings$Builder [^GroupServiceStubSettings this]
    (-> this (.toBuilder))))

