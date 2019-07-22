(ns com.google.cloud.pubsub.v1.stub.SubscriberStub
  "Base stub class for Google Cloud Pub/Sub API.

  This class is for advanced usage and reflects the underlying API directly."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1.stub SubscriberStub]))

(defn ->subscriber-stub
  "Constructor."
  (^SubscriberStub []
    (new SubscriberStub )))

(defn list-snapshots-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListSnapshotsRequest,com.google.pubsub.v1.ListSnapshotsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriberStub this]
    (-> this (.listSnapshotsCallable))))

(defn acknowledge-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.AcknowledgeRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriberStub this]
    (-> this (.acknowledgeCallable))))

(defn get-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriberStub this]
    (-> this (.getIamPolicyCallable))))

(defn pull-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.PullRequest,com.google.pubsub.v1.PullResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriberStub this]
    (-> this (.pullCallable))))

(defn list-subscriptions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListSubscriptionsRequest,com.google.pubsub.v1.ListSubscriptionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriberStub this]
    (-> this (.listSubscriptionsCallable))))

(defn modify-ack-deadline-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ModifyAckDeadlineRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriberStub this]
    (-> this (.modifyAckDeadlineCallable))))

(defn create-snapshot-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.CreateSnapshotRequest,com.google.pubsub.v1.Snapshot>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriberStub this]
    (-> this (.createSnapshotCallable))))

(defn seek-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.SeekRequest,com.google.pubsub.v1.SeekResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriberStub this]
    (-> this (.seekCallable))))

(defn update-subscription-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.UpdateSubscriptionRequest,com.google.pubsub.v1.Subscription>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriberStub this]
    (-> this (.updateSubscriptionCallable))))

(defn list-subscriptions-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListSubscriptionsRequest,com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSubscriptionsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriberStub this]
    (-> this (.listSubscriptionsPagedCallable))))

(defn get-subscription-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.GetSubscriptionRequest,com.google.pubsub.v1.Subscription>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriberStub this]
    (-> this (.getSubscriptionCallable))))

(defn streaming-pull-callable
  "returns: `com.google.api.gax.rpc.BidiStreamingCallable<com.google.pubsub.v1.StreamingPullRequest,com.google.pubsub.v1.StreamingPullResponse>`"
  (^com.google.api.gax.rpc.BidiStreamingCallable [^SubscriberStub this]
    (-> this (.streamingPullCallable))))

(defn modify-push-config-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ModifyPushConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriberStub this]
    (-> this (.modifyPushConfigCallable))))

(defn update-snapshot-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.UpdateSnapshotRequest,com.google.pubsub.v1.Snapshot>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriberStub this]
    (-> this (.updateSnapshotCallable))))

(defn delete-snapshot-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.DeleteSnapshotRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriberStub this]
    (-> this (.deleteSnapshotCallable))))

(defn set-iam-policy-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriberStub this]
    (-> this (.setIamPolicyCallable))))

(defn close
  ""
  ([^SubscriberStub this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriberStub this]
    (-> this (.testIamPermissionsCallable))))

(defn create-subscription-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.Subscription,com.google.pubsub.v1.Subscription>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriberStub this]
    (-> this (.createSubscriptionCallable))))

(defn delete-subscription-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.DeleteSubscriptionRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriberStub this]
    (-> this (.deleteSubscriptionCallable))))

(defn list-snapshots-paged-callable
  "returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListSnapshotsRequest,com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSnapshotsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriberStub this]
    (-> this (.listSnapshotsPagedCallable))))

