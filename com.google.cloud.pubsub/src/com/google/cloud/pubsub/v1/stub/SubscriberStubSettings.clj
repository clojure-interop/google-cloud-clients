(ns com.google.cloud.pubsub.v1.stub.SubscriberStubSettings
  "Settings class to configure an instance of SubscriberStub.

  The default instance has everything set to sensible defaults:


    The default service address (pubsub.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createSubscription to 30 seconds:



  SubscriberStubSettings.Builder subscriptionAdminSettingsBuilder =
      SubscriberStubSettings.newBuilder();
  subscriptionAdminSettingsBuilder.createSubscriptionSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  SubscriberStubSettings subscriptionAdminSettings = subscriptionAdminSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1.stub SubscriberStubSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (SubscriberStubSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (SubscriberStubSettings/getDefaultEndpoint )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (SubscriberStubSettings/getDefaultServiceScopes )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (SubscriberStubSettings/defaultCredentialsProviderBuilder )))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (SubscriberStubSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (SubscriberStubSettings/defaultTransportChannelProvider )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (SubscriberStubSettings/defaultApiClientHeaderProviderBuilder )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.pubsub.v1.stub.SubscriberStubSettings$Builder`"
  (^com.google.cloud.pubsub.v1.stub.SubscriberStubSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (SubscriberStubSettings/newBuilder client-context))
  (^com.google.cloud.pubsub.v1.stub.SubscriberStubSettings$Builder []
    (SubscriberStubSettings/newBuilder )))

(defn get-subscription-settings
  "Returns the object with the settings used for calls to getSubscription.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.GetSubscriptionRequest,com.google.pubsub.v1.Subscription>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriberStubSettings this]
    (-> this (.getSubscriptionSettings))))

(defn pull-settings
  "Returns the object with the settings used for calls to pull.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.PullRequest,com.google.pubsub.v1.PullResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriberStubSettings this]
    (-> this (.pullSettings))))

(defn create-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.pubsub.v1.stub.SubscriberStub`

  throws: java.io.IOException"
  ([^SubscriberStubSettings this]
    (-> this (.createStub))))

(defn delete-snapshot-settings
  "Returns the object with the settings used for calls to deleteSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.DeleteSnapshotRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriberStubSettings this]
    (-> this (.deleteSnapshotSettings))))

(defn test-iam-permissions-settings
  "Returns the object with the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriberStubSettings this]
    (-> this (.testIamPermissionsSettings))))

(defn seek-settings
  "Returns the object with the settings used for calls to seek.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.SeekRequest,com.google.pubsub.v1.SeekResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriberStubSettings this]
    (-> this (.seekSettings))))

(defn set-iam-policy-settings
  "Returns the object with the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriberStubSettings this]
    (-> this (.setIamPolicySettings))))

(defn acknowledge-settings
  "Returns the object with the settings used for calls to acknowledge.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.AcknowledgeRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriberStubSettings this]
    (-> this (.acknowledgeSettings))))

(defn create-snapshot-settings
  "Returns the object with the settings used for calls to createSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.CreateSnapshotRequest,com.google.pubsub.v1.Snapshot>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriberStubSettings this]
    (-> this (.createSnapshotSettings))))

(defn list-subscriptions-settings
  "Returns the object with the settings used for calls to listSubscriptions.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.pubsub.v1.ListSubscriptionsRequest,com.google.pubsub.v1.ListSubscriptionsResponse,com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSubscriptionsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^SubscriberStubSettings this]
    (-> this (.listSubscriptionsSettings))))

(defn update-subscription-settings
  "Returns the object with the settings used for calls to updateSubscription.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.UpdateSubscriptionRequest,com.google.pubsub.v1.Subscription>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriberStubSettings this]
    (-> this (.updateSubscriptionSettings))))

(defn modify-push-config-settings
  "Returns the object with the settings used for calls to modifyPushConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.ModifyPushConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriberStubSettings this]
    (-> this (.modifyPushConfigSettings))))

(defn streaming-pull-settings
  "Returns the object with the settings used for calls to streamingPull.

  returns: `com.google.api.gax.rpc.StreamingCallSettings<com.google.pubsub.v1.StreamingPullRequest,com.google.pubsub.v1.StreamingPullResponse>`"
  (^com.google.api.gax.rpc.StreamingCallSettings [^SubscriberStubSettings this]
    (-> this (.streamingPullSettings))))

(defn delete-subscription-settings
  "Returns the object with the settings used for calls to deleteSubscription.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.DeleteSubscriptionRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriberStubSettings this]
    (-> this (.deleteSubscriptionSettings))))

(defn modify-ack-deadline-settings
  "Returns the object with the settings used for calls to modifyAckDeadline.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.ModifyAckDeadlineRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriberStubSettings this]
    (-> this (.modifyAckDeadlineSettings))))

(defn update-snapshot-settings
  "Returns the object with the settings used for calls to updateSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.UpdateSnapshotRequest,com.google.pubsub.v1.Snapshot>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriberStubSettings this]
    (-> this (.updateSnapshotSettings))))

(defn get-iam-policy-settings
  "Returns the object with the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriberStubSettings this]
    (-> this (.getIamPolicySettings))))

(defn create-subscription-settings
  "Returns the object with the settings used for calls to createSubscription.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.Subscription,com.google.pubsub.v1.Subscription>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriberStubSettings this]
    (-> this (.createSubscriptionSettings))))

(defn list-snapshots-settings
  "Returns the object with the settings used for calls to listSnapshots.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.pubsub.v1.ListSnapshotsRequest,com.google.pubsub.v1.ListSnapshotsResponse,com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSnapshotsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^SubscriberStubSettings this]
    (-> this (.listSnapshotsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.pubsub.v1.stub.SubscriberStubSettings$Builder`"
  (^com.google.cloud.pubsub.v1.stub.SubscriberStubSettings$Builder [^SubscriberStubSettings this]
    (-> this (.toBuilder))))

