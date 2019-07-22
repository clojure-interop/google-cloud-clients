(ns com.google.cloud.pubsub.v1.SubscriptionAdminSettings
  "Settings class to configure an instance of SubscriptionAdminClient.

  The default instance has everything set to sensible defaults:


    The default service address (pubsub.googleapis.com) and default port (443) are used.
    Credentials are acquired automatically through Application Default Credentials.
    Retries are configured for idempotent methods but not for non-idempotent methods.


  The builder of this class is recursive, so contained classes are themselves builders. When
  build() is called, the tree of builders is called to create the complete settings object. For
  example, to set the total timeout of createSubscription to 30 seconds:



  SubscriptionAdminSettings.Builder subscriptionAdminSettingsBuilder =
      SubscriptionAdminSettings.newBuilder();
  subscriptionAdminSettingsBuilder.createSubscriptionSettings().getRetrySettings().toBuilder()
      .setTotalTimeout(Duration.ofSeconds(30));
  SubscriptionAdminSettings subscriptionAdminSettings = subscriptionAdminSettingsBuilder.build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1 SubscriptionAdminSettings]))

(defn *default-executor-provider-builder
  "Returns a builder for the default ExecutorProvider for this service.

  returns: `com.google.api.gax.core.InstantiatingExecutorProvider.Builder`"
  (^com.google.api.gax.core.InstantiatingExecutorProvider.Builder []
    (SubscriptionAdminSettings/defaultExecutorProviderBuilder )))

(defn *get-default-endpoint
  "Returns the default service endpoint.

  returns: `java.lang.String`"
  (^java.lang.String []
    (SubscriptionAdminSettings/getDefaultEndpoint )))

(defn *default-transport-channel-provider
  "returns: `com.google.api.gax.rpc.TransportChannelProvider`"
  (^com.google.api.gax.rpc.TransportChannelProvider []
    (SubscriptionAdminSettings/defaultTransportChannelProvider )))

(defn *new-builder
  "Returns a new builder for this class.

  client-context - `com.google.api.gax.rpc.ClientContext`

  returns: `com.google.cloud.pubsub.v1.SubscriptionAdminSettings$Builder`"
  (^com.google.cloud.pubsub.v1.SubscriptionAdminSettings$Builder [^com.google.api.gax.rpc.ClientContext client-context]
    (SubscriptionAdminSettings/newBuilder client-context))
  (^com.google.cloud.pubsub.v1.SubscriptionAdminSettings$Builder []
    (SubscriptionAdminSettings/newBuilder )))

(defn *default-credentials-provider-builder
  "Returns a builder for the default credentials for this service.

  returns: `com.google.api.gax.core.GoogleCredentialsProvider.Builder`"
  (^com.google.api.gax.core.GoogleCredentialsProvider.Builder []
    (SubscriptionAdminSettings/defaultCredentialsProviderBuilder )))

(defn *create
  "stub - `com.google.cloud.pubsub.v1.stub.SubscriberStubSettings`

  returns: `com.google.cloud.pubsub.v1.SubscriptionAdminSettings`

  throws: java.io.IOException"
  (^com.google.cloud.pubsub.v1.SubscriptionAdminSettings [^com.google.cloud.pubsub.v1.stub.SubscriberStubSettings stub]
    (SubscriptionAdminSettings/create stub)))

(defn *default-grpc-transport-provider-builder
  "Returns a builder for the default ChannelProvider for this service.

  returns: `com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder`"
  (^com.google.api.gax.grpc.InstantiatingGrpcChannelProvider.Builder []
    (SubscriptionAdminSettings/defaultGrpcTransportProviderBuilder )))

(defn *default-api-client-header-provider-builder
  "returns: `(value="The surface for customizing headers is not stable yet and may change in the future.")   com.google.api.gax.rpc.ApiClientHeaderProvider.Builder`"
  ([]
    (SubscriptionAdminSettings/defaultApiClientHeaderProviderBuilder )))

(defn *get-default-service-scopes
  "Returns the default service scopes.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (SubscriptionAdminSettings/getDefaultServiceScopes )))

(defn get-subscription-settings
  "Returns the object with the settings used for calls to getSubscription.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.GetSubscriptionRequest,com.google.pubsub.v1.Subscription>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriptionAdminSettings this]
    (-> this (.getSubscriptionSettings))))

(defn delete-snapshot-settings
  "Returns the object with the settings used for calls to deleteSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.DeleteSnapshotRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriptionAdminSettings this]
    (-> this (.deleteSnapshotSettings))))

(defn test-iam-permissions-settings
  "Returns the object with the settings used for calls to testIamPermissions.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriptionAdminSettings this]
    (-> this (.testIamPermissionsSettings))))

(defn seek-settings
  "Returns the object with the settings used for calls to seek.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.SeekRequest,com.google.pubsub.v1.SeekResponse>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriptionAdminSettings this]
    (-> this (.seekSettings))))

(defn set-iam-policy-settings
  "Returns the object with the settings used for calls to setIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriptionAdminSettings this]
    (-> this (.setIamPolicySettings))))

(defn create-snapshot-settings
  "Returns the object with the settings used for calls to createSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.CreateSnapshotRequest,com.google.pubsub.v1.Snapshot>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriptionAdminSettings this]
    (-> this (.createSnapshotSettings))))

(defn list-subscriptions-settings
  "Returns the object with the settings used for calls to listSubscriptions.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.pubsub.v1.ListSubscriptionsRequest,com.google.pubsub.v1.ListSubscriptionsResponse,com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSubscriptionsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^SubscriptionAdminSettings this]
    (-> this (.listSubscriptionsSettings))))

(defn update-subscription-settings
  "Returns the object with the settings used for calls to updateSubscription.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.UpdateSubscriptionRequest,com.google.pubsub.v1.Subscription>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriptionAdminSettings this]
    (-> this (.updateSubscriptionSettings))))

(defn modify-push-config-settings
  "Returns the object with the settings used for calls to modifyPushConfig.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.ModifyPushConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriptionAdminSettings this]
    (-> this (.modifyPushConfigSettings))))

(defn delete-subscription-settings
  "Returns the object with the settings used for calls to deleteSubscription.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.DeleteSubscriptionRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriptionAdminSettings this]
    (-> this (.deleteSubscriptionSettings))))

(defn update-snapshot-settings
  "Returns the object with the settings used for calls to updateSnapshot.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.UpdateSnapshotRequest,com.google.pubsub.v1.Snapshot>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriptionAdminSettings this]
    (-> this (.updateSnapshotSettings))))

(defn get-iam-policy-settings
  "Returns the object with the settings used for calls to getIamPolicy.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriptionAdminSettings this]
    (-> this (.getIamPolicySettings))))

(defn create-subscription-settings
  "Returns the object with the settings used for calls to createSubscription.

  returns: `com.google.api.gax.rpc.UnaryCallSettings<com.google.pubsub.v1.Subscription,com.google.pubsub.v1.Subscription>`"
  (^com.google.api.gax.rpc.UnaryCallSettings [^SubscriptionAdminSettings this]
    (-> this (.createSubscriptionSettings))))

(defn list-snapshots-settings
  "Returns the object with the settings used for calls to listSnapshots.

  returns: `com.google.api.gax.rpc.PagedCallSettings<com.google.pubsub.v1.ListSnapshotsRequest,com.google.pubsub.v1.ListSnapshotsResponse,com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSnapshotsPagedResponse>`"
  (^com.google.api.gax.rpc.PagedCallSettings [^SubscriptionAdminSettings this]
    (-> this (.listSnapshotsSettings))))

(defn to-builder
  "Returns a builder containing all the values of this settings class.

  returns: `com.google.cloud.pubsub.v1.SubscriptionAdminSettings$Builder`"
  (^com.google.cloud.pubsub.v1.SubscriptionAdminSettings$Builder [^SubscriptionAdminSettings this]
    (-> this (.toBuilder))))

