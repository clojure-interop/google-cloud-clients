(ns com.google.cloud.monitoring.v3.GroupServiceClient
  "Service Description: The Group API lets you inspect and manage your
  [groups](#google.monitoring.v3.Group).

  A group is a named filter that is used to identify a collection of monitored resources. Groups
  are typically used to mirror the physical and/or logical topology of the environment. Because
  group membership is computed dynamically, monitored resources that are started in the future are
  automatically placed in matching groups. By using a group to name monitored resources in, for
  example, an alert policy, the target of that alert policy is updated automatically as monitored
  resources are added and removed from the infrastructure.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (GroupServiceClient groupServiceClient = GroupServiceClient.create()) {
    GroupName name = GroupName.of(\"[PROJECT]\", \"[GROUP]\");
    Group response = groupServiceClient.getGroup(name);
  }

  Note: close() needs to be called on the groupServiceClient object to clean up resources such
  as threads. In the example above, try-with-resources is used, which automatically calls close().

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

  This class can be customized by passing in a custom instance of GroupServiceSettings to
  create(). For example:

  To customize credentials:



  GroupServiceSettings groupServiceSettings =
      GroupServiceSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  GroupServiceClient groupServiceClient =
      GroupServiceClient.create(groupServiceSettings);

  To customize the endpoint:



  GroupServiceSettings groupServiceSettings =
      GroupServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
  GroupServiceClient groupServiceClient =
      GroupServiceClient.create(groupServiceSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.monitoring.v3 GroupServiceClient]))

(defn *create
  "Constructs an instance of GroupServiceClient, using the given settings. The channels are
   created based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.monitoring.v3.GroupServiceSettings`

  returns: `com.google.cloud.monitoring.v3.GroupServiceClient`

  throws: java.io.IOException"
  (^com.google.cloud.monitoring.v3.GroupServiceClient [^com.google.cloud.monitoring.v3.GroupServiceSettings settings]
    (GroupServiceClient/create settings))
  (^com.google.cloud.monitoring.v3.GroupServiceClient []
    (GroupServiceClient/create )))

(defn delete-group
  "Deletes an existing group.

   Sample code:



   try (GroupServiceClient groupServiceClient = GroupServiceClient.create()) {
     GroupName name = GroupName.of(\"[PROJECT]\", \"[GROUP]\");
     groupServiceClient.deleteGroup(name);
   }

  name - The group to delete. The format is `\"projects/{project_id_or_number}/groups/{group_id}\"`. - `com.google.monitoring.v3.GroupName`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  ([^GroupServiceClient this ^com.google.monitoring.v3.GroupName name]
    (-> this (.deleteGroup name))))

(defn update-group
  "Updates an existing group. You can change any group attributes except `name`.

   Sample code:



   try (GroupServiceClient groupServiceClient = GroupServiceClient.create()) {
     Group group = Group.newBuilder().build();
     Group response = groupServiceClient.updateGroup(group);
   }

  group - The new definition of the group. All fields of the existing group, excepting `name`, are replaced with the corresponding fields of this group. - `com.google.monitoring.v3.Group`

  returns: `com.google.monitoring.v3.Group`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.monitoring.v3.Group [^GroupServiceClient this ^com.google.monitoring.v3.Group group]
    (-> this (.updateGroup group))))

(defn list-groups-callable
  "Lists the existing groups.

   Sample code:



   try (GroupServiceClient groupServiceClient = GroupServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     ListGroupsRequest request = ListGroupsRequest.newBuilder()
       .setName(name.toString())
       .build();
     while (true) {
       ListGroupsResponse response = groupServiceClient.listGroupsCallable().call(request);
       for (Group element : response.getGroupList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListGroupsRequest,com.google.monitoring.v3.ListGroupsResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GroupServiceClient this]
    (-> this (.listGroupsCallable))))

(defn create-group
  "Creates a new group.

   Sample code:



   try (GroupServiceClient groupServiceClient = GroupServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     Group group = Group.newBuilder().build();
     Group response = groupServiceClient.createGroup(name, group);
   }

  name - The project in which to create the group. The format is `\"projects/{project_id_or_number}\"`. - `com.google.monitoring.v3.ProjectName`
  group - A group definition. It is an error to define the `name` field because the system assigns the name. - `com.google.monitoring.v3.Group`

  returns: `com.google.monitoring.v3.Group`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.monitoring.v3.Group [^GroupServiceClient this ^com.google.monitoring.v3.ProjectName name ^com.google.monitoring.v3.Group group]
    (-> this (.createGroup name group)))
  (^com.google.monitoring.v3.Group [^GroupServiceClient this ^com.google.monitoring.v3.CreateGroupRequest request]
    (-> this (.createGroup request))))

(defn delete-group-callable
  "Deletes an existing group.

   Sample code:



   try (GroupServiceClient groupServiceClient = GroupServiceClient.create()) {
     GroupName name = GroupName.of(\"[PROJECT]\", \"[GROUP]\");
     DeleteGroupRequest request = DeleteGroupRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Void> future = groupServiceClient.deleteGroupCallable().futureCall(request);
     // Do something
     future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.DeleteGroupRequest,com.google.protobuf.Empty>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GroupServiceClient this]
    (-> this (.deleteGroupCallable))))

(defn list-group-members
  "Lists the monitored resources that are members of a group.

   Sample code:



   try (GroupServiceClient groupServiceClient = GroupServiceClient.create()) {
     GroupName name = GroupName.of(\"[PROJECT]\", \"[GROUP]\");
     for (MonitoredResource element : groupServiceClient.listGroupMembers(name).iterateAll()) {
       // doThingsWith(element);
     }
   }

  name - The group whose members are listed. The format is `\"projects/{project_id_or_number}/groups/{group_id}\"`. - `com.google.monitoring.v3.GroupName`

  returns: `com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupMembersPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupMembersPagedResponse [^GroupServiceClient this ^com.google.monitoring.v3.GroupName name]
    (-> this (.listGroupMembers name))))

(defn get-settings
  "returns: `com.google.cloud.monitoring.v3.GroupServiceSettings`"
  (^com.google.cloud.monitoring.v3.GroupServiceSettings [^GroupServiceClient this]
    (-> this (.getSettings))))

(defn list-groups-paged-callable
  "Lists the existing groups.

   Sample code:



   try (GroupServiceClient groupServiceClient = GroupServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     ListGroupsRequest request = ListGroupsRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<ListGroupsPagedResponse> future = groupServiceClient.listGroupsPagedCallable().futureCall(request);
     // Do something
     for (Group element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListGroupsRequest,com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GroupServiceClient this]
    (-> this (.listGroupsPagedCallable))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.monitoring.v3.stub.GroupServiceStub`"
  ([^GroupServiceClient this]
    (-> this (.getStub))))

(defn update-group-callable
  "Updates an existing group. You can change any group attributes except `name`.

   Sample code:



   try (GroupServiceClient groupServiceClient = GroupServiceClient.create()) {
     Group group = Group.newBuilder().build();
     UpdateGroupRequest request = UpdateGroupRequest.newBuilder()
       .setGroup(group)
       .build();
     ApiFuture<Group> future = groupServiceClient.updateGroupCallable().futureCall(request);
     // Do something
     Group response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.UpdateGroupRequest,com.google.monitoring.v3.Group>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GroupServiceClient this]
    (-> this (.updateGroupCallable))))

(defn create-group-callable
  "Creates a new group.

   Sample code:



   try (GroupServiceClient groupServiceClient = GroupServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     Group group = Group.newBuilder().build();
     CreateGroupRequest request = CreateGroupRequest.newBuilder()
       .setName(name.toString())
       .setGroup(group)
       .build();
     ApiFuture<Group> future = groupServiceClient.createGroupCallable().futureCall(request);
     // Do something
     Group response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.CreateGroupRequest,com.google.monitoring.v3.Group>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GroupServiceClient this]
    (-> this (.createGroupCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^GroupServiceClient this]
    (-> this (.isShutdown))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^GroupServiceClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn shutdown
  ""
  ([^GroupServiceClient this]
    (-> this (.shutdown))))

(defn list-group-members-paged-callable
  "Lists the monitored resources that are members of a group.

   Sample code:



   try (GroupServiceClient groupServiceClient = GroupServiceClient.create()) {
     GroupName name = GroupName.of(\"[PROJECT]\", \"[GROUP]\");
     ListGroupMembersRequest request = ListGroupMembersRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<ListGroupMembersPagedResponse> future = groupServiceClient.listGroupMembersPagedCallable().futureCall(request);
     // Do something
     for (MonitoredResource element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListGroupMembersRequest,com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupMembersPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GroupServiceClient this]
    (-> this (.listGroupMembersPagedCallable))))

(defn close
  ""
  ([^GroupServiceClient this]
    (-> this (.close))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^GroupServiceClient this]
    (-> this (.isTerminated))))

(defn list-groups
  "Lists the existing groups.

   Sample code:



   try (GroupServiceClient groupServiceClient = GroupServiceClient.create()) {
     ProjectName name = ProjectName.of(\"[PROJECT]\");
     ListGroupsRequest request = ListGroupsRequest.newBuilder()
       .setName(name.toString())
       .build();
     for (Group element : groupServiceClient.listGroups(request).iterateAll()) {
       // doThingsWith(element);
     }
   }

  request - The request object containing all of the parameters for the API call. - `com.google.monitoring.v3.ListGroupsRequest`

  returns: `com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.monitoring.v3.GroupServiceClient$ListGroupsPagedResponse [^GroupServiceClient this ^com.google.monitoring.v3.ListGroupsRequest request]
    (-> this (.listGroups request))))

(defn list-group-members-callable
  "Lists the monitored resources that are members of a group.

   Sample code:



   try (GroupServiceClient groupServiceClient = GroupServiceClient.create()) {
     GroupName name = GroupName.of(\"[PROJECT]\", \"[GROUP]\");
     ListGroupMembersRequest request = ListGroupMembersRequest.newBuilder()
       .setName(name.toString())
       .build();
     while (true) {
       ListGroupMembersResponse response = groupServiceClient.listGroupMembersCallable().call(request);
       for (MonitoredResource element : response.getMembersList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.ListGroupMembersRequest,com.google.monitoring.v3.ListGroupMembersResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GroupServiceClient this]
    (-> this (.listGroupMembersCallable))))

(defn shutdown-now
  ""
  ([^GroupServiceClient this]
    (-> this (.shutdownNow))))

(defn get-group-callable
  "Gets a single group.

   Sample code:



   try (GroupServiceClient groupServiceClient = GroupServiceClient.create()) {
     GroupName name = GroupName.of(\"[PROJECT]\", \"[GROUP]\");
     GetGroupRequest request = GetGroupRequest.newBuilder()
       .setName(name.toString())
       .build();
     ApiFuture<Group> future = groupServiceClient.getGroupCallable().futureCall(request);
     // Do something
     Group response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.monitoring.v3.GetGroupRequest,com.google.monitoring.v3.Group>`"
  (^com.google.api.gax.rpc.UnaryCallable [^GroupServiceClient this]
    (-> this (.getGroupCallable))))

(defn get-group
  "Gets a single group.

   Sample code:



   try (GroupServiceClient groupServiceClient = GroupServiceClient.create()) {
     GroupName name = GroupName.of(\"[PROJECT]\", \"[GROUP]\");
     Group response = groupServiceClient.getGroup(name);
   }

  name - The group to retrieve. The format is `\"projects/{project_id_or_number}/groups/{group_id}\"`. - `com.google.monitoring.v3.GroupName`

  returns: `com.google.monitoring.v3.Group`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.monitoring.v3.Group [^GroupServiceClient this ^com.google.monitoring.v3.GroupName name]
    (-> this (.getGroup name))))

