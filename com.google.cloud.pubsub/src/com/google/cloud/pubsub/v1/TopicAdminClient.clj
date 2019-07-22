(ns com.google.cloud.pubsub.v1.TopicAdminClient
  "Service Description: The service that an application uses to manipulate topics, and to send
  messages to a topic.

  To publish messages to a topic, see the Publisher class.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
    ProjectTopicName name = ProjectTopicName.of(\"[PROJECT]\", \"[TOPIC]\");
    Topic response = topicAdminClient.createTopic(name);
  }

  Note: close() needs to be called on the topicAdminClient object to clean up resources such as
  threads. In the example above, try-with-resources is used, which automatically calls close().

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

  This class can be customized by passing in a custom instance of TopicAdminSettings to
  create(). For example:

  To customize credentials:



  TopicAdminSettings topicAdminSettings =
      TopicAdminSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  TopicAdminClient topicAdminClient =
      TopicAdminClient.create(topicAdminSettings);

  To customize the endpoint:



  TopicAdminSettings topicAdminSettings =
      TopicAdminSettings.newBuilder().setEndpoint(myEndpoint).build();
  TopicAdminClient topicAdminClient =
      TopicAdminClient.create(topicAdminSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.pubsub.v1 TopicAdminClient]))

(defn *create
  "Constructs an instance of TopicAdminClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.pubsub.v1.TopicAdminSettings`

  returns: `com.google.cloud.pubsub.v1.TopicAdminClient`

  throws: java.io.IOException"
  (^com.google.cloud.pubsub.v1.TopicAdminClient [^com.google.cloud.pubsub.v1.TopicAdminSettings settings]
    (TopicAdminClient/create settings))
  (^com.google.cloud.pubsub.v1.TopicAdminClient []
    (TopicAdminClient/create )))

(defn list-topics-paged-callable
  "Lists matching topics.

   Sample code:



   try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     ListTopicsRequest request = ListTopicsRequest.newBuilder()
       .setProject(project.toString())
       .build();
     ApiFuture<ListTopicsPagedResponse> future = topicAdminClient.listTopicsPagedCallable().futureCall(request);
     // Do something
     for (Topic element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListTopicsRequest,com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TopicAdminClient this]
    (-> this (.listTopicsPagedCallable))))

(defn get-iam-policy-callable
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists
   and does not have a policy set.

   Sample code:



   try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
     String formattedResource = ProjectTopicName.format(\"[PROJECT]\", \"[TOPIC]\");
     GetIamPolicyRequest request = GetIamPolicyRequest.newBuilder()
       .setResource(formattedResource)
       .build();
     ApiFuture<Policy> future = topicAdminClient.getIamPolicyCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.GetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TopicAdminClient this]
    (-> this (.getIamPolicyCallable))))

(defn set-iam-policy
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
     String formattedResource = ProjectTopicName.format(\"[PROJECT]\", \"[TOPIC]\");
     Policy policy = Policy.newBuilder().build();
     Policy response = topicAdminClient.setIamPolicy(formattedResource, policy);
   }

  resource - REQUIRED: The resource for which the policy is being specified. See the operation documentation for the appropriate value for this field. - `java.lang.String`
  policy - REQUIRED: The complete policy to be applied to the `resource`. The size of the policy is limited to a few 10s of KB. An empty policy is a valid policy but certain Cloud Platform services (such as Projects) might reject them. - `com.google.iam.v1.Policy`

  returns: `com.google.iam.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.Policy [^TopicAdminClient this ^java.lang.String resource ^com.google.iam.v1.Policy policy]
    (-> this (.setIamPolicy resource policy)))
  (^com.google.iam.v1.Policy [^TopicAdminClient this ^com.google.iam.v1.SetIamPolicyRequest request]
    (-> this (.setIamPolicy request))))

(defn delete-topic-callable
  "Deletes the topic with the given name. Returns `NOT_FOUND` if the topic does not exist. After a
   topic is deleted, a new topic may be created with the same name; this is an entirely new topic
   with none of the old configuration or subscriptions. Existing subscriptions to this topic are
   not deleted, but their `topic` field is set to `_deleted-topic_`.

   Sample code:



   try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
     ProjectTopicName topic = ProjectTopicName.of(\"[PROJECT]\", \"[TOPIC]\");
     DeleteTopicRequest request = DeleteTopicRequest.newBuilder()
       .setTopic(topic.toString())
       .build();
     ApiFuture<Void> future = topicAdminClient.deleteTopicCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.DeleteTopicRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TopicAdminClient this]
    (-> this (.deleteTopicCallable))))

(defn update-topic
  "Updates an existing topic. Note that certain properties of a topic are not modifiable.

   Sample code:



   try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
     Topic topic = Topic.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateTopicRequest request = UpdateTopicRequest.newBuilder()
       .setTopic(topic)
       .setUpdateMask(updateMask)
       .build();
     Topic response = topicAdminClient.updateTopic(request);
   }

  request - The request object containing all of the parameters for the API call. - `com.google.pubsub.v1.UpdateTopicRequest`

  returns: `com.google.pubsub.v1.Topic`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.pubsub.v1.Topic [^TopicAdminClient this ^com.google.pubsub.v1.UpdateTopicRequest request]
    (-> this (.updateTopic request))))

(defn get-settings
  "returns: `com.google.cloud.pubsub.v1.TopicAdminSettings`"
  (^com.google.cloud.pubsub.v1.TopicAdminSettings [^TopicAdminClient this]
    (-> this (.getSettings))))

(defn list-topic-subscriptions-callable
  "Lists the names of the subscriptions on this topic.

   Sample code:



   try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
     ProjectTopicName topic = ProjectTopicName.of(\"[PROJECT]\", \"[TOPIC]\");
     ListTopicSubscriptionsRequest request = ListTopicSubscriptionsRequest.newBuilder()
       .setTopic(topic.toString())
       .build();
     while (true) {
       ListTopicSubscriptionsResponse response = topicAdminClient.listTopicSubscriptionsCallable().call(request);
       for (ProjectSubscriptionName element : ProjectSubscriptionName.parseList(response.getSubscriptionsList())) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListTopicSubscriptionsRequest,com.google.pubsub.v1.ListTopicSubscriptionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TopicAdminClient this]
    (-> this (.listTopicSubscriptionsCallable))))

(defn list-topics
  "Lists matching topics.

   Sample code:



   try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (Topic element : topicAdminClient.listTopics(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - The name of the project in which to list topics. Format is `projects/{project-id}`. - `com.google.pubsub.v1.ProjectName`

  returns: `com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicsPagedResponse [^TopicAdminClient this ^com.google.pubsub.v1.ProjectName project]
    (-> this (.listTopics project))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.pubsub.v1.stub.PublisherStub`"
  ([^TopicAdminClient this]
    (-> this (.getStub))))

(defn create-topic-callable
  "Creates the given topic with the given name. See the <a
   href=\"https://cloud.google.com/pubsub/docs/admin#resource_names\"> resource name
   rules</a>.

   Sample code:



   try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
     ProjectTopicName name = ProjectTopicName.of(\"[PROJECT]\", \"[TOPIC]\");
     Topic request = Topic.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Topic> future = topicAdminClient.createTopicCallable().futureCall(request);
     // Do something
     Topic response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.Topic,com.google.pubsub.v1.Topic>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TopicAdminClient this]
    (-> this (.createTopicCallable))))

(defn create-topic
  "Creates the given topic with the given name. See the <a
   href=\"https://cloud.google.com/pubsub/docs/admin#resource_names\"> resource name
   rules</a>.

   Sample code:



   try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
     ProjectTopicName name = ProjectTopicName.of(\"[PROJECT]\", \"[TOPIC]\");
     Topic response = topicAdminClient.createTopic(name);
   }

  name - The name of the topic. It must have the format `\"projects/{project}/topics/{topic}\"`. `{topic}` must start with a letter, and contain only letters (`[A-Za-z]`), numbers (`[0-9]`), dashes (`-`), underscores (`_`), periods (`.`), tildes (`~`), plus (`+`) or percent signs (`%`). It must be between 3 and 255 characters in length, and it must not start with `\"goog\"`. - `com.google.pubsub.v1.ProjectTopicName`

  returns: `com.google.pubsub.v1.Topic`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.pubsub.v1.Topic [^TopicAdminClient this ^com.google.pubsub.v1.ProjectTopicName name]
    (-> this (.createTopic name))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^TopicAdminClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^TopicAdminClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^TopicAdminClient this]
    (-> this (.shutdown))))

(defn update-topic-callable
  "Updates an existing topic. Note that certain properties of a topic are not modifiable.

   Sample code:



   try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
     Topic topic = Topic.newBuilder().build();
     FieldMask updateMask = FieldMask.newBuilder().build();
     UpdateTopicRequest request = UpdateTopicRequest.newBuilder()
       .setTopic(topic)
       .setUpdateMask(updateMask)
       .build();
     ApiFuture<Topic> future = topicAdminClient.updateTopicCallable().futureCall(request);
     // Do something
     Topic response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.UpdateTopicRequest,com.google.pubsub.v1.Topic>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TopicAdminClient this]
    (-> this (.updateTopicCallable))))

(defn get-topic-callable
  "Gets the configuration of a topic.

   Sample code:



   try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
     ProjectTopicName topic = ProjectTopicName.of(\"[PROJECT]\", \"[TOPIC]\");
     GetTopicRequest request = GetTopicRequest.newBuilder()
       .setTopic(topic.toString())
       .build();
     ApiFuture<Topic> future = topicAdminClient.getTopicCallable().futureCall(request);
     // Do something
     Topic response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.GetTopicRequest,com.google.pubsub.v1.Topic>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TopicAdminClient this]
    (-> this (.getTopicCallable))))

(defn list-topic-subscriptions
  "Lists the names of the subscriptions on this topic.

   Sample code:



   try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
     ProjectTopicName topic = ProjectTopicName.of(\"[PROJECT]\", \"[TOPIC]\");
     for (ProjectSubscriptionName element : topicAdminClient.listTopicSubscriptions(topic).iterateAllAsProjectSubscriptionName()) {
       // doThingsWith(element);
     }
   }

  topic - The name of the topic that subscriptions are attached to. Format is `projects/{project}/topics/{topic}`. - `com.google.pubsub.v1.ProjectTopicName`

  returns: `com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicSubscriptionsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicSubscriptionsPagedResponse [^TopicAdminClient this ^com.google.pubsub.v1.ProjectTopicName topic]
    (-> this (.listTopicSubscriptions topic))))

(defn set-iam-policy-callable
  "Sets the access control policy on the specified resource. Replaces any existing policy.

   Sample code:



   try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
     String formattedResource = ProjectTopicName.format(\"[PROJECT]\", \"[TOPIC]\");
     Policy policy = Policy.newBuilder().build();
     SetIamPolicyRequest request = SetIamPolicyRequest.newBuilder()
       .setResource(formattedResource)
       .setPolicy(policy)
       .build();
     ApiFuture<Policy> future = topicAdminClient.setIamPolicyCallable().futureCall(request);
     // Do something
     Policy response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.SetIamPolicyRequest,com.google.iam.v1.Policy>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TopicAdminClient this]
    (-> this (.setIamPolicyCallable))))

(defn close
  ""
  ([^TopicAdminClient this]
    (-> this (.close))))

(defn test-iam-permissions-callable
  "Returns permissions that a caller has on the specified resource. If the resource does not
   exist, this will return an empty set of permissions, not a NOT_FOUND error.

   Note: This operation is designed to be used for building permission-aware UIs and
   command-line tools, not for authorization checking. This operation may \"fail open\" without
   warning.

   Sample code:



   try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
     String formattedResource = ProjectTopicName.format(\"[PROJECT]\", \"[TOPIC]\");
     List<String> permissions = new ArrayList<>();
     TestIamPermissionsRequest request = TestIamPermissionsRequest.newBuilder()
       .setResource(formattedResource)
       .addAllPermissions(permissions)
       .build();
     ApiFuture<TestIamPermissionsResponse> future = topicAdminClient.testIamPermissionsCallable().futureCall(request);
     // Do something
     TestIamPermissionsResponse response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.iam.v1.TestIamPermissionsRequest,com.google.iam.v1.TestIamPermissionsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TopicAdminClient this]
    (-> this (.testIamPermissionsCallable))))

(defn get-iam-policy
  "Gets the access control policy for a resource. Returns an empty policy if the resource exists
   and does not have a policy set.

   Sample code:



   try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
     String formattedResource = ProjectTopicName.format(\"[PROJECT]\", \"[TOPIC]\");
     Policy response = topicAdminClient.getIamPolicy(formattedResource);
   }

  resource - REQUIRED: The resource for which the policy is being requested. See the operation documentation for the appropriate value for this field. - `java.lang.String`

  returns: `com.google.iam.v1.Policy`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.Policy [^TopicAdminClient this ^java.lang.String resource]
    (-> this (.getIamPolicy resource))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^TopicAdminClient this]
    (-> this (.isTerminated))))

(defn get-topic
  "Gets the configuration of a topic.

   Sample code:



   try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
     ProjectTopicName topic = ProjectTopicName.of(\"[PROJECT]\", \"[TOPIC]\");
     Topic response = topicAdminClient.getTopic(topic);
   }

  topic - The name of the topic to get. Format is `projects/{project}/topics/{topic}`. - `com.google.pubsub.v1.ProjectTopicName`

  returns: `com.google.pubsub.v1.Topic`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.pubsub.v1.Topic [^TopicAdminClient this ^com.google.pubsub.v1.ProjectTopicName topic]
    (-> this (.getTopic topic))))

(defn list-topics-callable
  "Lists matching topics.

   Sample code:



   try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     ListTopicsRequest request = ListTopicsRequest.newBuilder()
       .setProject(project.toString())
       .build();
     while (true) {
       ListTopicsResponse response = topicAdminClient.listTopicsCallable().call(request);
       for (Topic element : response.getTopicsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListTopicsRequest,com.google.pubsub.v1.ListTopicsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TopicAdminClient this]
    (-> this (.listTopicsCallable))))

(defn delete-topic
  "Deletes the topic with the given name. Returns `NOT_FOUND` if the topic does not exist. After a
   topic is deleted, a new topic may be created with the same name; this is an entirely new topic
   with none of the old configuration or subscriptions. Existing subscriptions to this topic are
   not deleted, but their `topic` field is set to `_deleted-topic_`.

   Sample code:



   try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
     ProjectTopicName topic = ProjectTopicName.of(\"[PROJECT]\", \"[TOPIC]\");
     topicAdminClient.deleteTopic(topic);
   }

  topic - Name of the topic to delete. Format is `projects/{project}/topics/{topic}`. - `com.google.pubsub.v1.ProjectTopicName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^TopicAdminClient this ^com.google.pubsub.v1.ProjectTopicName topic]
    (-> this (.deleteTopic topic))))

(defn list-topic-subscriptions-paged-callable
  "Lists the names of the subscriptions on this topic.

   Sample code:



   try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
     ProjectTopicName topic = ProjectTopicName.of(\"[PROJECT]\", \"[TOPIC]\");
     ListTopicSubscriptionsRequest request = ListTopicSubscriptionsRequest.newBuilder()
       .setTopic(topic.toString())
       .build();
     ApiFuture<ListTopicSubscriptionsPagedResponse> future = topicAdminClient.listTopicSubscriptionsPagedCallable().futureCall(request);
     // Do something
     for (ProjectSubscriptionName element : future.get().iterateAllAsProjectSubscriptionName()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.pubsub.v1.ListTopicSubscriptionsRequest,com.google.cloud.pubsub.v1.TopicAdminClient$ListTopicSubscriptionsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^TopicAdminClient this]
    (-> this (.listTopicSubscriptionsPagedCallable))))

(defn shutdown-now
  ""
  ([^TopicAdminClient this]
    (-> this (.shutdownNow))))

(defn test-iam-permissions
  "Returns permissions that a caller has on the specified resource. If the resource does not
   exist, this will return an empty set of permissions, not a NOT_FOUND error.

   Note: This operation is designed to be used for building permission-aware UIs and
   command-line tools, not for authorization checking. This operation may \"fail open\" without
   warning.

   Sample code:



   try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
     String formattedResource = ProjectTopicName.format(\"[PROJECT]\", \"[TOPIC]\");
     List<String> permissions = new ArrayList<>();
     TestIamPermissionsResponse response = topicAdminClient.testIamPermissions(formattedResource, permissions);
   }

  resource - REQUIRED: The resource for which the policy detail is being requested. See the operation documentation for the appropriate value for this field. - `java.lang.String`
  permissions - The set of permissions to check for the `resource`. Permissions with wildcards (such as '*' or 'storage.*') are not allowed. For more information see [IAM Overview](https://cloud.google.com/iam/docs/overview#permissions). - `java.util.List`

  returns: `com.google.iam.v1.TestIamPermissionsResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.iam.v1.TestIamPermissionsResponse [^TopicAdminClient this ^java.lang.String resource ^java.util.List permissions]
    (-> this (.testIamPermissions resource permissions)))
  (^com.google.iam.v1.TestIamPermissionsResponse [^TopicAdminClient this ^com.google.iam.v1.TestIamPermissionsRequest request]
    (-> this (.testIamPermissions request))))

