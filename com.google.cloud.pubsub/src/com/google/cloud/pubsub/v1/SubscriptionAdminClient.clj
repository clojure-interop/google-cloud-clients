(ns com.google.cloud.pubsub.v1.SubscriptionAdminClient
  "Service Description: The service that an application uses to manipulate subscriptions and to
  consume messages from a subscription via the `Pull` method or by establishing a bi-directional
  stream using the `StreamingPull` method.

  To retrieve messages from a subscription, see the Subscriber class.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
    ProjectSubscriptionName name = ProjectSubscriptionName.of(\"[PROJECT]\", \"[SUBSCRIPTION]\");
    ProjectTopicName topic = ProjectTopicName.of(\"[PROJECT]\", \"[TOPIC]\");
    PushConfig pushConfig = PushConfig.newBuilder().build();
    int ackDeadlineSeconds = 0;
    Subscription response = subscriptionAdminClient.createSubscription(name, topic, pushConfig, ackDeadlineSeconds);
  }

  Note: close() needs to be called on the subscriptionAdminClient object to clean up resources
  such as threads. In the example above, try-with-resources is used, which automatically calls
  close().

  The surface of this class includes several types of Java methods for each of the API's
  methods:


    A \"flattened\" method. With this type of method, the fields of the request type have been
        converted into function parameters. It may be the case that not all fields are available as
        parameters, and not every API method will have a flattened method entry point.
    A \"request object\" method. This type of method only takes one parameter, a request object,
        which must be constructed before the call. Not every API method will have a request object
        method.
    A \"callable\" method. This type of method takes no parameters and returns an immutable API
        callable object, which can be used to initiate calls to the service.


  See the individual methods for example code.

  Many parameters require resource names to be formatted in a particular way. To assist with
  these names, this class includes a format method for each type of name, and additionally a parse
  method to extract the individual identifiers contained within names that are returned.

  This class can be customized by passing in a custom instance of SubscriptionAdminSettings to
  create(). For example:

  To customize credentials:



  SubscriptionAdminSettings subscriptionAdminSettings =
      SubscriptionAdminSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  SubscriptionAdminClient subscriptionAdminClient =
      SubscriptionAdminClient.create(subscriptionAdminSettings);

  To customize the endpoint:



  SubscriptionAdminSettings subscriptionAdminSettings =
      SubscriptionAdminSettings.newBuilder().setEndpoint(myEndpoint).build();
  SubscriptionAdminClient subscriptionAdminClient =
      SubscriptionAdminClient.create(subscriptionAdminSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1 SubscriptionAdminClient]))

(defn *create
  "Constructs an instance of SubscriptionAdminClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.pubsub.v1.SubscriptionAdminSettings`

  returns: `com.google.cloud.pubsub.v1.SubscriptionAdminClient`

  throws: java.io.IOException"
  (^com.google.cloud.pubsub.v1.SubscriptionAdminClient [^com.google.cloud.pubsub.v1.SubscriptionAdminSettings settings]
    (SubscriptionAdminClient/create settings))
  (^com.google.cloud.pubsub.v1.SubscriptionAdminClient []
    (SubscriptionAdminClient/create )))

(defn list-snapshots-callable
  "Lists the existing snapshots. Snapshots are used in <a
   href=\"https://cloud.google.com/pubsub/docs/replay-overview\">Seek</a> operations, which
   allow you to manage message acknowledgments in bulk. That is, you can set the acknowledgment
   state of messages in an existing subscription to the state captured by a snapshot.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     ListSnapshotsRequest request = ListSnapshotsRequest.newBuilder()
       .setProject(project.toString())
       .build();
     while (true) {
       ListSnapshotsResponse response = subscriptionAdminClient.listSnapshotsCallable().call(request);
       for (Snapshot element : response.getSnapshotsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListSnapshotsRequest,com.google.pubsub.v1.ListSnapshotsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriptionAdminClient this]
    (-> this (.listSnapshotsCallable))))

(defn get-iam-policy-callable
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists
   and does not have a policy set.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     String formattedResource = ProjectSubscriptionName.format(\"[PROJECT]\", \"[SUBSCRIPTION]\");
     GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder()
       .setResource(formattedResource)
       .build();
     ApiFuture<Policy> future = subscriptionAdminClient.getIamPolicyCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriptionAdminClient this]
    (-> this (.getIamPolicyCallable))))

(defn set-iam-policy
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     String formattedResource = ProjectSubscriptionName.format(\"[PROJECT]\", \"[SUBSCRIPTION]\");
     Policy policy = Policy.newBuilder().build();
     Policy response = subscriptionAdminClient.setIamPolicy(formattedResource, policy);
   }

  resource - REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field. - `java.lang.String`
  policy - REQUIRED: The complete policy to be applied to the `resource`. The size of the policy is limited to a few 10s of KB. An empty policy is a valid policy but certain Cloud Platform services (such as Projects) might reject them. - `com.google.iam.v1.Policy`

  returns: `com.google.iam.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.Policy [^SubscriptionAdminClient this ^java.lang.String resource ^com.google.iam.v1.Policy policy]
    (-> this (.setIamPolicy resource policy)))
  (^com.google.iam.v1.Policy [^SubscriptionAdminClient this ^com.google.iam.v1.SetIamPolicyRequest request]
    (-> this (.setIamPolicy request))))

(defn list-subscriptions-callable
  "Lists matching subscriptions.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     ListSubscriptionsRequest request = ListSubscriptionsRequest.newBuilder()
       .setProject(project.toString())
       .build();
     while (true) {
       ListSubscriptionsResponse response = subscriptionAdminClient.listSubscriptionsCallable().call(request);
       for (Subscription element : response.getSubscriptionsList()) {
         // doThingsWith(element);
       }
       String nextPageToken = response.getNextPageToken();
       if (!Strings.isNullOrEmpty(nextPageToken)) {
         request = request.toBuilder().setPageToken(nextPageToken).build();
       } else {
         break;
       }
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListSubscriptionsRequest,com.google.pubsub.v1.ListSubscriptionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriptionAdminClient this]
    (-> this (.listSubscriptionsCallable))))

(defn get-settings
  "returns: `com.google.cloud.pubsub.v1.SubscriptionAdminSettings`"
  (^com.google.cloud.pubsub.v1.SubscriptionAdminSettings [^SubscriptionAdminClient this]
    (-> this (.getSettings))))

(defn delete-subscription
  "Deletes an existing subscription. All messages retained in the subscription are immediately
   dropped. Calls to `Pull` after deletion will return `NOT_FOUND`. After a subscription is
   deleted, a new one may be created with the same name, but the new one has no association with
   the old subscription or its topic unless the same topic is specified.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     ProjectSubscriptionName subscription = ProjectSubscriptionName.of(\"[PROJECT]\", \"[SUBSCRIPTION]\");
     subscriptionAdminClient.deleteSubscription(subscription);
   }

  subscription - The subscription to delete. Format is `projects/{project}/subscriptions/{sub}`. - `com.google.pubsub.v1.ProjectSubscriptionName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^SubscriptionAdminClient this ^com.google.pubsub.v1.ProjectSubscriptionName subscription]
    (-> this (.deleteSubscription subscription))))

(defn create-snapshot-callable
  "Creates a snapshot from the requested subscription. Snapshots are used in <a
   href=\"https://cloud.google.com/pubsub/docs/replay-overview\">Seek</a> operations, which
   allow you to manage message acknowledgments in bulk. That is, you can set the acknowledgment
   state of messages in an existing subscription to the state captured by a snapshot.
   <br><br>If the snapshot already exists, returns `ALREADY_EXISTS`. If the requested
   subscription doesn't exist, returns `NOT_FOUND`. If the backlog in the subscription is too old
   -- and the resulting snapshot would expire in less than 1 hour -- then `FAILED_PRECONDITION` is
   returned. See also the `Snapshot.expire_time` field. If the name is not provided in the
   request, the server will assign a random name for this snapshot on the same project as the
   subscription, conforming to the [resource name
   format](https://cloud.google.com/pubsub/docs/admin#resource_names). The generated name is
   populated in the returned Snapshot object. Note that for REST API requests, you must specify a
   name in the request.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     ProjectSnapshotName name = ProjectSnapshotName.of(\"[PROJECT]\", \"[SNAPSHOT]\");
     ProjectSubscriptionName subscription = ProjectSubscriptionName.of(\"[PROJECT]\", \"[SUBSCRIPTION]\");
     CreateSnapshotRequest request = CreateSnapshotRequest.newBuilder()
       .setName(name.toString())
       .setSubscription(subscription.toString())
       .build();
     ApiFuture<Snapshot> future = subscriptionAdminClient.createSnapshotCallable().futureCall(request);
     // Do something
     Snapshot response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.CreateSnapshotRequest,com.google.pubsub.v1.Snapshot>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriptionAdminClient this]
    (-> this (.createSnapshotCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.pubsub.v1.stub.SubscriberStub`"
  ([^SubscriptionAdminClient this]
    (-> this (.getStub))))

(defn seek-callable
  "Seeks an existing subscription to a point in time or to a given snapshot, whichever is provided
   in the request. Snapshots are used in <a
   href=\"https://cloud.google.com/pubsub/docs/replay-overview\">Seek</a> operations, which
   allow you to manage message acknowledgments in bulk. That is, you can set the acknowledgment
   state of messages in an existing subscription to the state captured by a snapshot. Note that
   both the subscription and the snapshot must be on the same topic.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     ProjectSubscriptionName subscription = ProjectSubscriptionName.of(\"[PROJECT]\", \"[SUBSCRIPTION]\");
     SeekRequest request = SeekRequest.newBuilder()
       .setSubscription(subscription.toString())
       .build();
     ApiFuture<SeekResponse> future = subscriptionAdminClient.seekCallable().futureCall(request);
     // Do something
     SeekResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.SeekRequest,com.google.pubsub.v1.SeekResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriptionAdminClient this]
    (-> this (.seekCallable))))

(defn update-subscription-callable
  "Updates an existing subscription. Note that certain properties of a subscription, such as its
   topic, are not modifiable.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     int ackDeadlineSeconds = 42;
     Subscription subscription = Subscription.newBuilder()
       .setAckDeadlineSeconds(ackDeadlineSeconds)
       .build();
     String pathsElement = \"ack_deadline_seconds\";
     List<String> paths = Arrays.asList(pathsElement);
     FieldMask updateMask = FieldMask.newBuilder()
       .addAllPaths(paths)
       .build();
     UpdateSubscriptionRequest request = UpdateSubscriptionRequest.newBuilder()
       .setSubscription(subscription)
       .setUpdateMask(updateMask)
       .build();
     ApiFuture<Subscription> future = subscriptionAdminClient.updateSubscriptionCallable().futureCall(request);
     // Do something
     Subscription response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.UpdateSubscriptionRequest,com.google.pubsub.v1.Subscription>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriptionAdminClient this]
    (-> this (.updateSubscriptionCallable))))

(defn list-subscriptions-paged-callable
  "Lists matching subscriptions.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     ListSubscriptionsRequest request = ListSubscriptionsRequest.newBuilder()
       .setProject(project.toString())
       .build();
     ApiFuture<ListSubscriptionsPagedResponse> future = subscriptionAdminClient.listSubscriptionsPagedCallable().futureCall(request);
     // Do something
     for (Subscription element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListSubscriptionsRequest,com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSubscriptionsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriptionAdminClient this]
    (-> this (.listSubscriptionsPagedCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^SubscriptionAdminClient this]
    (-> this (.isShutdown))))

(defn seek
  "Seeks an existing subscription to a point in time or to a given snapshot, whichever is provided
   in the request. Snapshots are used in <a
   href=\"https://cloud.google.com/pubsub/docs/replay-overview\">Seek</a> operations, which
   allow you to manage message acknowledgments in bulk. That is, you can set the acknowledgment
   state of messages in an existing subscription to the state captured by a snapshot. Note that
   both the subscription and the snapshot must be on the same topic.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     ProjectSubscriptionName subscription = ProjectSubscriptionName.of(\"[PROJECT]\", \"[SUBSCRIPTION]\");
     SeekRequest request = SeekRequest.newBuilder()
       .setSubscription(subscription.toString())
       .build();
     SeekResponse response = subscriptionAdminClient.seek(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.pubsub.v1.SeekRequest`

  returns: `com.google.pubsub.v1.SeekResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.pubsub.v1.SeekResponse [^SubscriptionAdminClient this ^com.google.pubsub.v1.SeekRequest request]
    (-> this (.seek request))))

(defn get-subscription-callable
  "Gets the configuration details of a subscription.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     ProjectSubscriptionName subscription = ProjectSubscriptionName.of(\"[PROJECT]\", \"[SUBSCRIPTION]\");
     GetSubscriptionRequest request = GetSubscriptionRequest.newBuilder()
       .setSubscription(subscription.toString())
       .build();
     ApiFuture<Subscription> future = subscriptionAdminClient.getSubscriptionCallable().futureCall(request);
     // Do something
     Subscription response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.GetSubscriptionRequest,com.google.pubsub.v1.Subscription>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriptionAdminClient this]
    (-> this (.getSubscriptionCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^SubscriptionAdminClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn modify-push-config
  "Modifies the `PushConfig` for a specified subscription.

   This may be used to change a push subscription to a pull one (signified by an empty
   `PushConfig`) or vice versa, or change the endpoint URL and other attributes of a push
   subscription. Messages will accumulate for delivery continuously through the call regardless of
   changes to the `PushConfig`.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     ProjectSubscriptionName subscription = ProjectSubscriptionName.of(\"[PROJECT]\", \"[SUBSCRIPTION]\");
     PushConfig pushConfig = PushConfig.newBuilder().build();
     subscriptionAdminClient.modifyPushConfig(subscription, pushConfig);
   }

  subscription - The name of the subscription. Format is `projects/{project}/subscriptions/{sub}`. - `com.google.pubsub.v1.ProjectSubscriptionName`
  push-config - The push configuration for future deliveries. An empty `pushConfig` indicates that the Pub/Sub system should stop pushing messages from the given subscription and allow messages to be pulled and acknowledged - effectively pausing the subscription if `Pull` or `StreamingPull` is not called. - `com.google.pubsub.v1.PushConfig`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^SubscriptionAdminClient this ^com.google.pubsub.v1.ProjectSubscriptionName subscription ^com.google.pubsub.v1.PushConfig push-config]
    (-> this (.modifyPushConfig subscription push-config)))
  ([^SubscriptionAdminClient this ^com.google.pubsub.v1.ModifyPushConfigRequest request]
    (-> this (.modifyPushConfig request))))

(defn shutdown
  ""
  ([^SubscriptionAdminClient this]
    (-> this (.shutdown))))

(defn delete-snapshot
  "Removes an existing snapshot. Snapshots are used in <a
   href=\"https://cloud.google.com/pubsub/docs/replay-overview\">Seek</a> operations, which
   allow you to manage message acknowledgments in bulk. That is, you can set the acknowledgment
   state of messages in an existing subscription to the state captured by a
   snapshot.<br><br> When the snapshot is deleted, all messages retained in the
   snapshot are immediately dropped. After a snapshot is deleted, a new one may be created with
   the same name, but the new one has no association with the old snapshot or its subscription,
   unless the same subscription is specified.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     ProjectSnapshotName snapshot = ProjectSnapshotName.of(\"[PROJECT]\", \"[SNAPSHOT]\");
     subscriptionAdminClient.deleteSnapshot(snapshot);
   }

  snapshot - The name of the snapshot to delete. Format is `projects/{project}/snapshots/{snap}`. - `com.google.pubsub.v1.ProjectSnapshotName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^SubscriptionAdminClient this ^com.google.pubsub.v1.ProjectSnapshotName snapshot]
    (-> this (.deleteSnapshot snapshot))))

(defn get-subscription
  "Gets the configuration details of a subscription.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     ProjectSubscriptionName subscription = ProjectSubscriptionName.of(\"[PROJECT]\", \"[SUBSCRIPTION]\");
     Subscription response = subscriptionAdminClient.getSubscription(subscription);
   }

  subscription - The name of the subscription to get. Format is `projects/{project}/subscriptions/{sub}`. - `com.google.pubsub.v1.ProjectSubscriptionName`

  returns: `com.google.pubsub.v1.Subscription`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.pubsub.v1.Subscription [^SubscriptionAdminClient this ^com.google.pubsub.v1.ProjectSubscriptionName subscription]
    (-> this (.getSubscription subscription))))

(defn modify-push-config-callable
  "Modifies the `PushConfig` for a specified subscription.

   This may be used to change a push subscription to a pull one (signified by an empty
   `PushConfig`) or vice versa, or change the endpoint URL and other attributes of a push
   subscription. Messages will accumulate for delivery continuously through the call regardless of
   changes to the `PushConfig`.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     ProjectSubscriptionName subscription = ProjectSubscriptionName.of(\"[PROJECT]\", \"[SUBSCRIPTION]\");
     PushConfig pushConfig = PushConfig.newBuilder().build();
     ModifyPushConfigRequest request = ModifyPushConfigRequest.newBuilder()
       .setSubscription(subscription.toString())
       .setPushConfig(pushConfig)
       .build();
     ApiFuture<Void> future = subscriptionAdminClient.modifyPushConfigCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ModifyPushConfigRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriptionAdminClient this]
    (-> this (.modifyPushConfigCallable))))

(defn update-snapshot-callable
  "Updates an existing snapshot. Snapshots are used in <a
   href=\"https://cloud.google.com/pubsub/docs/replay-overview\">Seek</a> operations, which
   allow you to manage message acknowledgments in bulk. That is, you can set the acknowledgment
   state of messages in an existing subscription to the state captured by a snapshot.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     long seconds = 123456L;
     Timestamp expireTime = Timestamp.newBuilder()
       .setSeconds(seconds)
       .build();
     Snapshot snapshot = Snapshot.newBuilder()
       .setExpireTime(expireTime)
       .build();
     String pathsElement = \"expire_time\";
     List<String> paths = Arrays.asList(pathsElement);
     FieldMask updateMask = FieldMask.newBuilder()
       .addAllPaths(paths)
       .build();
     UpdateSnapshotRequest request = UpdateSnapshotRequest.newBuilder()
       .setSnapshot(snapshot)
       .setUpdateMask(updateMask)
       .build();
     ApiFuture<Snapshot> future = subscriptionAdminClient.updateSnapshotCallable().futureCall(request);
     // Do something
     Snapshot response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.UpdateSnapshotRequest,com.google.pubsub.v1.Snapshot>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriptionAdminClient this]
    (-> this (.updateSnapshotCallable))))

(defn delete-snapshot-callable
  "Removes an existing snapshot. Snapshots are used in <a
   href=\"https://cloud.google.com/pubsub/docs/replay-overview\">Seek</a> operations, which
   allow you to manage message acknowledgments in bulk. That is, you can set the acknowledgment
   state of messages in an existing subscription to the state captured by a
   snapshot.<br><br> When the snapshot is deleted, all messages retained in the
   snapshot are immediately dropped. After a snapshot is deleted, a new one may be created with
   the same name, but the new one has no association with the old snapshot or its subscription,
   unless the same subscription is specified.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     ProjectSnapshotName snapshot = ProjectSnapshotName.of(\"[PROJECT]\", \"[SNAPSHOT]\");
     DeleteSnapshotRequest request = DeleteSnapshotRequest.newBuilder()
       .setSnapshot(snapshot.toString())
       .build();
     ApiFuture<Void> future = subscriptionAdminClient.deleteSnapshotCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.DeleteSnapshotRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriptionAdminClient this]
    (-> this (.deleteSnapshotCallable))))

(defn set-iam-policy-callable
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     String formattedResource = ProjectSubscriptionName.format(\"[PROJECT]\", \"[SUBSCRIPTION]\");
     Policy policy = Policy.newBuilder().build();
     SetIamPolicyRequest request = SetIamPolicyRequest.newBuilder()
       .setResource(formattedResource)
       .setPolicy(policy)
       .build();
     ApiFuture<Policy> future = subscriptionAdminClient.setIamPolicyCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriptionAdminClient this]
    (-> this (.setIamPolicyCallable))))

(defn close
  ""
  ([^SubscriptionAdminClient this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "Returns permissions that a caller has on the specified resource. If the resource does not
   exist, this will return an empty set of permissions, not a NOT_FOUND error.

   Note: This operation is designed to be used for building permission-aware UIs and
   command-line tools, not for authorization checking. This operation may \"fail open\" without
   warning.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     String formattedResource = ProjectSubscriptionName.format(\"[PROJECT]\", \"[SUBSCRIPTION]\");
     List<String> permissions = new ArrayList<>();
     TestIamPermissionsRequest request = TestIamPermissionsRequest.newBuilder()
       .setResource(formattedResource)
       .addAllPermissions(permissions)
       .build();
     ApiFuture<TestIamPermissionsResponse> future = subscriptionAdminClient.testIamPermissionsCallable().futureCall(request);
     // Do something
     TestIamPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriptionAdminClient this]
    (-> this (.testIamPermissionsCallable))))

(defn get-iam-policy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists
   and does not have a policy set.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     String formattedResource = ProjectSubscriptionName.format(\"[PROJECT]\", \"[SUBSCRIPTION]\");
     Policy response = subscriptionAdminClient.getIamPolicy(formattedResource);
   }

  resource - REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field. - `java.lang.String`

  returns: `com.google.iam.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.Policy [^SubscriptionAdminClient this ^java.lang.String resource]
    (-> this (.getIamPolicy resource))))

(defn list-snapshots
  "Lists the existing snapshots. Snapshots are used in <a
   href=\"https://cloud.google.com/pubsub/docs/replay-overview\">Seek</a> operations, which
   allow you to manage message acknowledgments in bulk. That is, you can set the acknowledgment
   state of messages in an existing subscription to the state captured by a snapshot.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (Snapshot element : subscriptionAdminClient.listSnapshots(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - The name of the project in which to list snapshots. Format is `projects/{project-id}`. - `com.google.pubsub.v1.ProjectName`

  returns: `com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSnapshotsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSnapshotsPagedResponse [^SubscriptionAdminClient this ^com.google.pubsub.v1.ProjectName project]
    (-> this (.listSnapshots project))))

(defn create-subscription-callable
  "Creates a subscription to a given topic. See the <a
   href=\"https://cloud.google.com/pubsub/docs/admin#resource_names\"> resource name
   rules</a>. If the subscription already exists, returns `ALREADY_EXISTS`. If the
   corresponding topic doesn't exist, returns `NOT_FOUND`.

   If the name is not provided in the request, the server will assign a random name for this
   subscription on the same project as the topic, conforming to the [resource name
   format](https://cloud.google.com/pubsub/docs/admin#resource_names). The generated name is
   populated in the returned Subscription object. Note that for REST API requests, you must
   specify a name in the request.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     ProjectSubscriptionName name = ProjectSubscriptionName.of(\"[PROJECT]\", \"[SUBSCRIPTION]\");
     TopicName topic = ProjectTopicName.of(\"[PROJECT]\", \"[TOPIC]\");
     Subscription request = Subscription.newBuilder()
       .setName(name.toString())
       .setTopic(topic.toString())
       .build();
     ApiFuture<Subscription> future = subscriptionAdminClient.createSubscriptionCallable().futureCall(request);
     // Do something
     Subscription response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.Subscription,com.google.pubsub.v1.Subscription>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriptionAdminClient this]
    (-> this (.createSubscriptionCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^SubscriptionAdminClient this]
    (-> this (.isTerminated))))

(defn delete-subscription-callable
  "Deletes an existing subscription. All messages retained in the subscription are immediately
   dropped. Calls to `Pull` after deletion will return `NOT_FOUND`. After a subscription is
   deleted, a new one may be created with the same name, but the new one has no association with
   the old subscription or its topic unless the same topic is specified.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     ProjectSubscriptionName subscription = ProjectSubscriptionName.of(\"[PROJECT]\", \"[SUBSCRIPTION]\");
     DeleteSubscriptionRequest request = DeleteSubscriptionRequest.newBuilder()
       .setSubscription(subscription.toString())
       .build();
     ApiFuture<Void> future = subscriptionAdminClient.deleteSubscriptionCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.DeleteSubscriptionRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriptionAdminClient this]
    (-> this (.deleteSubscriptionCallable))))

(defn update-subscription
  "Updates an existing subscription. Note that certain properties of a subscription, such as its
   topic, are not modifiable.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     int ackDeadlineSeconds = 42;
     Subscription subscription = Subscription.newBuilder()
       .setAckDeadlineSeconds(ackDeadlineSeconds)
       .build();
     String pathsElement = \"ack_deadline_seconds\";
     List<String> paths = Arrays.asList(pathsElement);
     FieldMask updateMask = FieldMask.newBuilder()
       .addAllPaths(paths)
       .build();
     UpdateSubscriptionRequest request = UpdateSubscriptionRequest.newBuilder()
       .setSubscription(subscription)
       .setUpdateMask(updateMask)
       .build();
     Subscription response = subscriptionAdminClient.updateSubscription(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.pubsub.v1.UpdateSubscriptionRequest`

  returns: `com.google.pubsub.v1.Subscription`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.pubsub.v1.Subscription [^SubscriptionAdminClient this ^com.google.pubsub.v1.UpdateSubscriptionRequest request]
    (-> this (.updateSubscription request))))

(defn list-snapshots-paged-callable
  "Lists the existing snapshots. Snapshots are used in <a
   href=\"https://cloud.google.com/pubsub/docs/replay-overview\">Seek</a> operations, which
   allow you to manage message acknowledgments in bulk. That is, you can set the acknowledgment
   state of messages in an existing subscription to the state captured by a snapshot.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     ListSnapshotsRequest request = ListSnapshotsRequest.newBuilder()
       .setProject(project.toString())
       .build();
     ApiFuture<ListSnapshotsPagedResponse> future = subscriptionAdminClient.listSnapshotsPagedCallable().futureCall(request);
     // Do something
     for (Snapshot element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListSnapshotsRequest,com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSnapshotsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^SubscriptionAdminClient this]
    (-> this (.listSnapshotsPagedCallable))))

(defn create-subscription
  "Creates a subscription to a given topic. See the <a
   href=\"https://cloud.google.com/pubsub/docs/admin#resource_names\"> resource name
   rules</a>. If the subscription already exists, returns `ALREADY_EXISTS`. If the
   corresponding topic doesn't exist, returns `NOT_FOUND`.

   If the name is not provided in the request, the server will assign a random name for this
   subscription on the same project as the topic, conforming to the [resource name
   format](https://cloud.google.com/pubsub/docs/admin#resource_names). The generated name is
   populated in the returned Subscription object. Note that for REST API requests, you must
   specify a name in the request.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     ProjectSubscriptionName name = ProjectSubscriptionName.of(\"[PROJECT]\", \"[SUBSCRIPTION]\");
     ProjectTopicName topic = ProjectTopicName.of(\"[PROJECT]\", \"[TOPIC]\");
     PushConfig pushConfig = PushConfig.newBuilder().build();
     int ackDeadlineSeconds = 0;
     Subscription response = subscriptionAdminClient.createSubscription(name, topic, pushConfig, ackDeadlineSeconds);
   }

  name - The name of the subscription. It must have the format `\"projects/{project}/subscriptions/{subscription}\"`. `{subscription}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `\"goog\"` - `com.google.pubsub.v1.ProjectSubscriptionName`
  topic - The name of the topic from which this subscription is receiving messages. Format is `projects/{project}/topics/{topic}`. The value of this field will be `_deleted-topic_` if the topic has been deleted. - `com.google.pubsub.v1.ProjectTopicName`
  push-config - If push delivery is used with this subscription, this field is used to configure it. An empty `pushConfig` signifies that the subscriber will pull and ack messages using API methods. - `com.google.pubsub.v1.PushConfig`
  ack-deadline-seconds - The approximate amount of time (on a best-effort basis) Pub/Sub waits for the subscriber to acknowledge receipt before resending the message. In the interval after the message is delivered and before it is acknowledged, it is considered to be <i>outstanding</i>. During that time period, the message will not be redelivered (on a best-effort basis). For pull subscriptions, this value is used as the initial value for the ack deadline. To override this value for a given message, call `ModifyAckDeadline` with the corresponding `ack_id` if using non-streaming pull or send the `ack_id` in a `StreamingModifyAckDeadlineRequest` if using streaming pull. The minimum custom deadline you can specify is 10 seconds. The maximum custom deadline you can specify is 600 seconds (10 minutes). If this parameter is 0, a default value of 10 seconds is used. For push delivery, this value is also used to set the request timeout for the call to the push endpoint. If the subscriber never acknowledges the message, the Pub/Sub system will eventually redeliver the message. - `int`

  returns: `com.google.pubsub.v1.Subscription`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.pubsub.v1.Subscription [^SubscriptionAdminClient this ^com.google.pubsub.v1.ProjectSubscriptionName name ^com.google.pubsub.v1.ProjectTopicName topic ^com.google.pubsub.v1.PushConfig push-config ^Integer ack-deadline-seconds]
    (-> this (.createSubscription name topic push-config ack-deadline-seconds)))
  (^com.google.pubsub.v1.Subscription [^SubscriptionAdminClient this ^com.google.pubsub.v1.Subscription request]
    (-> this (.createSubscription request))))

(defn update-snapshot
  "Updates an existing snapshot. Snapshots are used in <a
   href=\"https://cloud.google.com/pubsub/docs/replay-overview\">Seek</a> operations, which
   allow you to manage message acknowledgments in bulk. That is, you can set the acknowledgment
   state of messages in an existing subscription to the state captured by a snapshot.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     long seconds = 123456L;
     Timestamp expireTime = Timestamp.newBuilder()
       .setSeconds(seconds)
       .build();
     Snapshot snapshot = Snapshot.newBuilder()
       .setExpireTime(expireTime)
       .build();
     String pathsElement = \"expire_time\";
     List<String> paths = Arrays.asList(pathsElement);
     FieldMask updateMask = FieldMask.newBuilder()
       .addAllPaths(paths)
       .build();
     UpdateSnapshotRequest request = UpdateSnapshotRequest.newBuilder()
       .setSnapshot(snapshot)
       .setUpdateMask(updateMask)
       .build();
     Snapshot response = subscriptionAdminClient.updateSnapshot(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.pubsub.v1.UpdateSnapshotRequest`

  returns: `com.google.pubsub.v1.Snapshot`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.pubsub.v1.Snapshot [^SubscriptionAdminClient this ^com.google.pubsub.v1.UpdateSnapshotRequest request]
    (-> this (.updateSnapshot request))))

(defn shutdown-now
  ""
  ([^SubscriptionAdminClient this]
    (-> this (.shutdownNow))))

(defn create-snapshot
  "Creates a snapshot from the requested subscription. Snapshots are used in <a
   href=\"https://cloud.google.com/pubsub/docs/replay-overview\">Seek</a> operations, which
   allow you to manage message acknowledgments in bulk. That is, you can set the acknowledgment
   state of messages in an existing subscription to the state captured by a snapshot.
   <br><br>If the snapshot already exists, returns `ALREADY_EXISTS`. If the requested
   subscription doesn't exist, returns `NOT_FOUND`. If the backlog in the subscription is too old
   -- and the resulting snapshot would expire in less than 1 hour -- then `FAILED_PRECONDITION` is
   returned. See also the `Snapshot.expire_time` field. If the name is not provided in the
   request, the server will assign a random name for this snapshot on the same project as the
   subscription, conforming to the [resource name
   format](https://cloud.google.com/pubsub/docs/admin#resource_names). The generated name is
   populated in the returned Snapshot object. Note that for REST API requests, you must specify a
   name in the request.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     ProjectSnapshotName name = ProjectSnapshotName.of(\"[PROJECT]\", \"[SNAPSHOT]\");
     ProjectSubscriptionName subscription = ProjectSubscriptionName.of(\"[PROJECT]\", \"[SUBSCRIPTION]\");
     Snapshot response = subscriptionAdminClient.createSnapshot(name, subscription);
   }

  name - Optional user-provided name for this snapshot. If the name is not provided in the request, the server will assign a random name for this snapshot on the same project as the subscription. Note that for REST API requests, you must specify a name. See the <a href=\"https://cloud.google.com/pubsub/docs/admin#resource_names\"> resource name rules</a>. Format is `projects/{project}/snapshots/{snap}`. - `com.google.pubsub.v1.ProjectSnapshotName`
  subscription - The subscription whose backlog the snapshot retains. Specifically, the created snapshot is guaranteed to retain: (a) The existing backlog on the subscription. More precisely, this is defined as the messages in the subscription's backlog that are unacknowledged upon the successful completion of the `CreateSnapshot` request; as well as: (b) Any messages published to the subscription's topic following the successful completion of the CreateSnapshot request. Format is `projects/{project}/subscriptions/{sub}`. - `com.google.pubsub.v1.ProjectSubscriptionName`

  returns: `com.google.pubsub.v1.Snapshot`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.pubsub.v1.Snapshot [^SubscriptionAdminClient this ^com.google.pubsub.v1.ProjectSnapshotName name ^com.google.pubsub.v1.ProjectSubscriptionName subscription]
    (-> this (.createSnapshot name subscription)))
  (^com.google.pubsub.v1.Snapshot [^SubscriptionAdminClient this ^com.google.pubsub.v1.CreateSnapshotRequest request]
    (-> this (.createSnapshot request))))

(defn test-iam-permissions
  "Returns permissions that a caller has on the specified resource. If the resource does not
   exist, this will return an empty set of permissions, not a NOT_FOUND error.

   Note: This operation is designed to be used for building permission-aware UIs and
   command-line tools, not for authorization checking. This operation may \"fail open\" without
   warning.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     String formattedResource = ProjectSubscriptionName.format(\"[PROJECT]\", \"[SUBSCRIPTION]\");
     List<String> permissions = new ArrayList<>();
     TestIamPermissionsResponse response = subscriptionAdminClient.testIamPermissions(formattedResource, permissions);
   }

  resource - REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field. - `java.lang.String`
  permissions - The set of permissions to check for the `resource`. Permissions with wildcards (such as '*' or 'storage.*') are not allowed. For more information see [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions). - `java.util.List`

  returns: `com.google.iam.v1.TestIamPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.TestIamPermissionsResponse [^SubscriptionAdminClient this ^java.lang.String resource ^java.util.List permissions]
    (-> this (.testIamPermissions resource permissions)))
  (^com.google.iam.v1.TestIamPermissionsResponse [^SubscriptionAdminClient this ^com.google.iam.v1.TestIamPermissionsRequest request]
    (-> this (.testIamPermissions request))))

(defn list-subscriptions
  "Lists matching subscriptions.

   Sample code:



   try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (Subscription element : subscriptionAdminClient.listSubscriptions(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - The name of the project in which to list subscriptions. Format is `projects/{project-id}`. - `com.google.pubsub.v1.ProjectName`

  returns: `com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSubscriptionsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.pubsub.v1.SubscriptionAdminClient$ListSubscriptionsPagedResponse [^SubscriptionAdminClient this ^com.google.pubsub.v1.ProjectName project]
    (-> this (.listSubscriptions project))))

