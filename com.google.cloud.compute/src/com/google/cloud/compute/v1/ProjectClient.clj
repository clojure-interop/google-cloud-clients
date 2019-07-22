(ns com.google.cloud.compute.v1.ProjectClient
  "Service Description: Creates and runs virtual machines on Google Cloud Platform.

  This class provides the ability to make remote calls to the backing service through method
  calls that map to API methods. Sample code to get started:



  try (ProjectClient projectClient = ProjectClient.create()) {
    ProjectName project = ProjectName.of(\"[PROJECT]\");
    Operation response = projectClient.disableXpnHostProject(project);
  }

  Note: close() needs to be called on the projectClient object to clean up resources such as
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

  This class can be customized by passing in a custom instance of ProjectSettings to create().
  For example:

  To customize credentials:



  ProjectSettings projectSettings =
      ProjectSettings.newBuilder()
          .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
          .build();
  ProjectClient projectClient =
      ProjectClient.create(projectSettings);

  To customize the endpoint:



  ProjectSettings projectSettings =
      ProjectSettings.newBuilder().setEndpoint(myEndpoint).build();
  ProjectClient projectClient =
      ProjectClient.create(projectSettings);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectClient]))

(defn *create
  "Constructs an instance of ProjectClient, using the given settings. The channels are created
   based on the settings passed in, or defaults for any settings that are not set.

  settings - `com.google.cloud.compute.v1.ProjectSettings`

  returns: `com.google.cloud.compute.v1.ProjectClient`

  throws: java.io.IOException"
  (^com.google.cloud.compute.v1.ProjectClient [^com.google.cloud.compute.v1.ProjectSettings settings]
    (ProjectClient/create settings))
  (^com.google.cloud.compute.v1.ProjectClient []
    (ProjectClient/create )))

(defn set-common-instance-metadata-project-callable
  "Sets metadata common to all instances within the specified project using the data included in
   the request.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     Metadata metadataResource = Metadata.newBuilder().build();
     SetCommonInstanceMetadataProjectHttpRequest request = SetCommonInstanceMetadataProjectHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setMetadataResource(metadataResource)
       .build();
     ApiFuture<Operation> future = projectClient.setCommonInstanceMetadataProjectCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetCommonInstanceMetadataProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectClient this]
    (-> this (.setCommonInstanceMetadataProjectCallable))))

(defn enable-xpn-resource-project
  "Enable service resource (a.k.a service project) for a host project, so that subnets in the host
   project can be used by instances in the service project.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     ProjectsEnableXpnResourceRequest projectsEnableXpnResourceRequestResource = ProjectsEnableXpnResourceRequest.newBuilder().build();
     Operation response = projectClient.enableXpnResourceProject(project, projectsEnableXpnResourceRequestResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  projects-enable-xpn-resource-request-resource - `com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^ProjectClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.ProjectsEnableXpnResourceRequest projects-enable-xpn-resource-request-resource]
    (-> this (.enableXpnResourceProject project projects-enable-xpn-resource-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^ProjectClient this ^com.google.cloud.compute.v1.EnableXpnResourceProjectHttpRequest request]
    (-> this (.enableXpnResourceProject request))))

(defn move-instance-project-callable
  "Moves an instance and its attached persistent disks from one zone to another.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     InstanceMoveRequest instanceMoveRequestResource = InstanceMoveRequest.newBuilder().build();
     MoveInstanceProjectHttpRequest request = MoveInstanceProjectHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setInstanceMoveRequestResource(instanceMoveRequestResource)
       .build();
     ApiFuture<Operation> future = projectClient.moveInstanceProjectCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.MoveInstanceProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectClient this]
    (-> this (.moveInstanceProjectCallable))))

(defn list-xpn-hosts-projects-paged-callable
  "Lists all shared VPC host projects visible to the user in an organization.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ProjectsListXpnHostsRequest projectsListXpnHostsRequestResource = ProjectsListXpnHostsRequest.newBuilder().build();
     ListXpnHostsProjectsHttpRequest request = ListXpnHostsProjectsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setProjectsListXpnHostsRequestResource(projectsListXpnHostsRequestResource)
       .build();
     ApiFuture<ListXpnHostsProjectsPagedResponse> future = projectClient.listXpnHostsProjectsPagedCallable().futureCall(request);
     // Do something
     for (Project element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListXpnHostsProjectsHttpRequest,com.google.cloud.compute.v1.ProjectClient$ListXpnHostsProjectsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectClient this]
    (-> this (.listXpnHostsProjectsPagedCallable))))

(defn disable-xpn-host-project-callable
  "Disable this project as a shared VPC host project.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     DisableXpnHostProjectHttpRequest request = DisableXpnHostProjectHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<Operation> future = projectClient.disableXpnHostProjectCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DisableXpnHostProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectClient this]
    (-> this (.disableXpnHostProjectCallable))))

(defn get-settings
  "returns: `com.google.cloud.compute.v1.ProjectSettings`"
  (^com.google.cloud.compute.v1.ProjectSettings [^ProjectClient this]
    (-> this (.getSettings))))

(defn move-disk-project
  "Moves a persistent disk from one zone to another.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     DiskMoveRequest diskMoveRequestResource = DiskMoveRequest.newBuilder().build();
     Operation response = projectClient.moveDiskProject(project, diskMoveRequestResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  disk-move-request-resource - `com.google.cloud.compute.v1.DiskMoveRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^ProjectClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.DiskMoveRequest disk-move-request-resource]
    (-> this (.moveDiskProject project disk-move-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^ProjectClient this ^com.google.cloud.compute.v1.MoveDiskProjectHttpRequest request]
    (-> this (.moveDiskProject request))))

(defn set-usage-export-bucket-project
  "Enables the usage export feature and sets the usage export bucket where reports are stored. If
   you provide an empty request body using this method, the usage export feature will be disabled.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     UsageExportLocation usageExportLocationResource = UsageExportLocation.newBuilder().build();
     Operation response = projectClient.setUsageExportBucketProject(project, usageExportLocationResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  usage-export-location-resource - The location in Cloud Storage and naming method of the daily usage report. Contains bucket_name and report_name prefix. - `com.google.cloud.compute.v1.UsageExportLocation`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^ProjectClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.UsageExportLocation usage-export-location-resource]
    (-> this (.setUsageExportBucketProject project usage-export-location-resource)))
  (^com.google.cloud.compute.v1.Operation [^ProjectClient this ^com.google.cloud.compute.v1.SetUsageExportBucketProjectHttpRequest request]
    (-> this (.setUsageExportBucketProject request))))

(defn get-project
  "Returns the specified Project resource.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     Project response = projectClient.getProject(project);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.Project`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Project [^ProjectClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.getProject project))))

(defn move-instance-project
  "Moves an instance and its attached persistent disks from one zone to another.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     InstanceMoveRequest instanceMoveRequestResource = InstanceMoveRequest.newBuilder().build();
     Operation response = projectClient.moveInstanceProject(project, instanceMoveRequestResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  instance-move-request-resource - `com.google.cloud.compute.v1.InstanceMoveRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^ProjectClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.InstanceMoveRequest instance-move-request-resource]
    (-> this (.moveInstanceProject project instance-move-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^ProjectClient this ^com.google.cloud.compute.v1.MoveInstanceProjectHttpRequest request]
    (-> this (.moveInstanceProject request))))

(defn get-stub
  "returns: `(value="A restructuring of stub classes is planned, so this may break in the future")  com.google.cloud.compute.v1.stub.ProjectStub`"
  ([^ProjectClient this]
    (-> this (.getStub))))

(defn list-xpn-hosts-projects
  "Lists all shared VPC host projects visible to the user in an organization.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     ProjectsListXpnHostsRequest projectsListXpnHostsRequestResource = ProjectsListXpnHostsRequest.newBuilder().build();
     for (Project element : projectClient.listXpnHostsProjects(project, projectsListXpnHostsRequestResource).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  projects-list-xpn-hosts-request-resource - `com.google.cloud.compute.v1.ProjectsListXpnHostsRequest`

  returns: `com.google.cloud.compute.v1.ProjectClient$ListXpnHostsProjectsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.ProjectClient$ListXpnHostsProjectsPagedResponse [^ProjectClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.ProjectsListXpnHostsRequest projects-list-xpn-hosts-request-resource]
    (-> this (.listXpnHostsProjects project projects-list-xpn-hosts-request-resource)))
  (^com.google.cloud.compute.v1.ProjectClient$ListXpnHostsProjectsPagedResponse [^ProjectClient this ^com.google.cloud.compute.v1.ListXpnHostsProjectsHttpRequest request]
    (-> this (.listXpnHostsProjects request))))

(defn enable-xpn-resource-project-callable
  "Enable service resource (a.k.a service project) for a host project, so that subnets in the host
   project can be used by instances in the service project.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ProjectsEnableXpnResourceRequest projectsEnableXpnResourceRequestResource = ProjectsEnableXpnResourceRequest.newBuilder().build();
     EnableXpnResourceProjectHttpRequest request = EnableXpnResourceProjectHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setProjectsEnableXpnResourceRequestResource(projectsEnableXpnResourceRequestResource)
       .build();
     ApiFuture<Operation> future = projectClient.enableXpnResourceProjectCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.EnableXpnResourceProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectClient this]
    (-> this (.enableXpnResourceProjectCallable))))

(defn shutdown?
  "returns: `boolean`"
  (^Boolean [^ProjectClient this]
    (-> this (.isShutdown))))

(defn set-usage-export-bucket-project-callable
  "Enables the usage export feature and sets the usage export bucket where reports are stored. If
   you provide an empty request body using this method, the usage export feature will be disabled.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     UsageExportLocation usageExportLocationResource = UsageExportLocation.newBuilder().build();
     SetUsageExportBucketProjectHttpRequest request = SetUsageExportBucketProjectHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setUsageExportLocationResource(usageExportLocationResource)
       .build();
     ApiFuture<Operation> future = projectClient.setUsageExportBucketProjectCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetUsageExportBucketProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectClient this]
    (-> this (.setUsageExportBucketProjectCallable))))

(defn await-termination
  "duration - `long`
  unit - `java.util.concurrent.TimeUnit`

  returns: `boolean`

  throws: java.lang.InterruptedException"
  (^Boolean [^ProjectClient this ^Long duration ^java.util.concurrent.TimeUnit unit]
    (-> this (.awaitTermination duration unit))))

(defn set-default-network-tier-project-callable
  "Sets the default network tier of the project. The default network tier is used when an
   address/forwardingRule/instance is created without specifying the network tier field.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ProjectsSetDefaultNetworkTierRequest projectsSetDefaultNetworkTierRequestResource = ProjectsSetDefaultNetworkTierRequest.newBuilder().build();
     SetDefaultNetworkTierProjectHttpRequest request = SetDefaultNetworkTierProjectHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setProjectsSetDefaultNetworkTierRequestResource(projectsSetDefaultNetworkTierRequestResource)
       .build();
     ApiFuture<Operation> future = projectClient.setDefaultNetworkTierProjectCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.SetDefaultNetworkTierProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectClient this]
    (-> this (.setDefaultNetworkTierProjectCallable))))

(defn shutdown
  ""
  ([^ProjectClient this]
    (-> this (.shutdown))))

(defn disable-xpn-host-project
  "Disable this project as a shared VPC host project.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     Operation response = projectClient.disableXpnHostProject(project);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^ProjectClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.disableXpnHostProject project))))

(defn get-xpn-host-project
  "Gets the shared VPC host project that this project links to. May be empty if no link exists.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     Project response = projectClient.getXpnHostProject(project);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.Project`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Project [^ProjectClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.getXpnHostProject project))))

(defn get-project-callable
  "Returns the specified Project resource.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     GetProjectHttpRequest request = GetProjectHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<Project> future = projectClient.getProjectCallable().futureCall(request);
     // Do something
     Project response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetProjectHttpRequest,com.google.cloud.compute.v1.Project>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectClient this]
    (-> this (.getProjectCallable))))

(defn enable-xpn-host-project
  "Enable this project as a shared VPC host project.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     Operation response = projectClient.enableXpnHostProject(project);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^ProjectClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.enableXpnHostProject project))))

(defn enable-xpn-host-project-callable
  "Enable this project as a shared VPC host project.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     EnableXpnHostProjectHttpRequest request = EnableXpnHostProjectHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<Operation> future = projectClient.enableXpnHostProjectCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.EnableXpnHostProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectClient this]
    (-> this (.enableXpnHostProjectCallable))))

(defn get-xpn-host-project-callable
  "Gets the shared VPC host project that this project links to. May be empty if no link exists.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     GetXpnHostProjectHttpRequest request = GetXpnHostProjectHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<Project> future = projectClient.getXpnHostProjectCallable().futureCall(request);
     // Do something
     Project response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetXpnHostProjectHttpRequest,com.google.cloud.compute.v1.Project>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectClient this]
    (-> this (.getXpnHostProjectCallable))))

(defn close
  ""
  ([^ProjectClient this]
    (-> this (.close))))

(defn get-xpn-resources-projects-paged-callable
  "Gets service resources (a.k.a service project) associated with this host project.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     GetXpnResourcesProjectsHttpRequest request = GetXpnResourcesProjectsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     ApiFuture<GetXpnResourcesProjectsPagedResponse> future = projectClient.getXpnResourcesProjectsPagedCallable().futureCall(request);
     // Do something
     for (XpnResourceId element : future.get().iterateAll()) {
       // doThingsWith(element);
     }
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetXpnResourcesProjectsHttpRequest,com.google.cloud.compute.v1.ProjectClient$GetXpnResourcesProjectsPagedResponse>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectClient this]
    (-> this (.getXpnResourcesProjectsPagedCallable))))

(defn disable-xpn-resource-project
  "Disable a serivce resource (a.k.a service project) associated with this host project.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     ProjectsDisableXpnResourceRequest projectsDisableXpnResourceRequestResource = ProjectsDisableXpnResourceRequest.newBuilder().build();
     Operation response = projectClient.disableXpnResourceProject(project, projectsDisableXpnResourceRequestResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  projects-disable-xpn-resource-request-resource - `com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^ProjectClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.ProjectsDisableXpnResourceRequest projects-disable-xpn-resource-request-resource]
    (-> this (.disableXpnResourceProject project projects-disable-xpn-resource-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^ProjectClient this ^com.google.cloud.compute.v1.DisableXpnResourceProjectHttpRequest request]
    (-> this (.disableXpnResourceProject request))))

(defn list-xpn-hosts-projects-callable
  "Lists all shared VPC host projects visible to the user in an organization.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ProjectsListXpnHostsRequest projectsListXpnHostsRequestResource = ProjectsListXpnHostsRequest.newBuilder().build();
     ListXpnHostsProjectsHttpRequest request = ListXpnHostsProjectsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setProjectsListXpnHostsRequestResource(projectsListXpnHostsRequestResource)
       .build();
     while (true) {
       XpnHostList response = projectClient.listXpnHostsProjectsCallable().call(request);
       for (Project element : response.getItemsList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.ListXpnHostsProjectsHttpRequest,com.google.cloud.compute.v1.XpnHostList>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectClient this]
    (-> this (.listXpnHostsProjectsCallable))))

(defn terminated?
  "returns: `boolean`"
  (^Boolean [^ProjectClient this]
    (-> this (.isTerminated))))

(defn get-xpn-resources-projects-callable
  "Gets service resources (a.k.a service project) associated with this host project.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     GetXpnResourcesProjectsHttpRequest request = GetXpnResourcesProjectsHttpRequest.newBuilder()
       .setProject(formattedProject)
       .build();
     while (true) {
       ProjectsGetXpnResources response = projectClient.getXpnResourcesProjectsCallable().call(request);
       for (XpnResourceId element : response.getResourcesList()) {
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

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.GetXpnResourcesProjectsHttpRequest,com.google.cloud.compute.v1.ProjectsGetXpnResources>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectClient this]
    (-> this (.getXpnResourcesProjectsCallable))))

(defn set-common-instance-metadata-project
  "Sets metadata common to all instances within the specified project using the data included in
   the request.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     Metadata metadataResource = Metadata.newBuilder().build();
     Operation response = projectClient.setCommonInstanceMetadataProject(project, metadataResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  metadata-resource - A metadata key/value entry. - `com.google.cloud.compute.v1.Metadata`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^ProjectClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.Metadata metadata-resource]
    (-> this (.setCommonInstanceMetadataProject project metadata-resource)))
  (^com.google.cloud.compute.v1.Operation [^ProjectClient this ^com.google.cloud.compute.v1.SetCommonInstanceMetadataProjectHttpRequest request]
    (-> this (.setCommonInstanceMetadataProject request))))

(defn move-disk-project-callable
  "Moves a persistent disk from one zone to another.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     DiskMoveRequest diskMoveRequestResource = DiskMoveRequest.newBuilder().build();
     MoveDiskProjectHttpRequest request = MoveDiskProjectHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setDiskMoveRequestResource(diskMoveRequestResource)
       .build();
     ApiFuture<Operation> future = projectClient.moveDiskProjectCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.MoveDiskProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectClient this]
    (-> this (.moveDiskProjectCallable))))

(defn disable-xpn-resource-project-callable
  "Disable a serivce resource (a.k.a service project) associated with this host project.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     String formattedProject = ProjectName.format(\"[PROJECT]\");
     ProjectsDisableXpnResourceRequest projectsDisableXpnResourceRequestResource = ProjectsDisableXpnResourceRequest.newBuilder().build();
     DisableXpnResourceProjectHttpRequest request = DisableXpnResourceProjectHttpRequest.newBuilder()
       .setProject(formattedProject)
       .setProjectsDisableXpnResourceRequestResource(projectsDisableXpnResourceRequestResource)
       .build();
     ApiFuture<Operation> future = projectClient.disableXpnResourceProjectCallable().futureCall(request);
     // Do something
     Operation response = future.get();
   }

  returns: `com.google.api.gax.rpc.UnaryCallable<com.google.cloud.compute.v1.DisableXpnResourceProjectHttpRequest,com.google.cloud.compute.v1.Operation>`"
  (^com.google.api.gax.rpc.UnaryCallable [^ProjectClient this]
    (-> this (.disableXpnResourceProjectCallable))))

(defn shutdown-now
  ""
  ([^ProjectClient this]
    (-> this (.shutdownNow))))

(defn set-default-network-tier-project
  "Sets the default network tier of the project. The default network tier is used when an
   address/forwardingRule/instance is created without specifying the network tier field.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     ProjectsSetDefaultNetworkTierRequest projectsSetDefaultNetworkTierRequestResource = ProjectsSetDefaultNetworkTierRequest.newBuilder().build();
     Operation response = projectClient.setDefaultNetworkTierProject(project, projectsSetDefaultNetworkTierRequestResource);
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`
  projects-set-default-network-tier-request-resource - `com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest`

  returns: `com.google.cloud.compute.v1.Operation`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.Operation [^ProjectClient this ^com.google.cloud.compute.v1.ProjectName project ^com.google.cloud.compute.v1.ProjectsSetDefaultNetworkTierRequest projects-set-default-network-tier-request-resource]
    (-> this (.setDefaultNetworkTierProject project projects-set-default-network-tier-request-resource)))
  (^com.google.cloud.compute.v1.Operation [^ProjectClient this ^com.google.cloud.compute.v1.SetDefaultNetworkTierProjectHttpRequest request]
    (-> this (.setDefaultNetworkTierProject request))))

(defn get-xpn-resources-projects
  "Gets service resources (a.k.a service project) associated with this host project.

   Sample code:



   try (ProjectClient projectClient = ProjectClient.create()) {
     ProjectName project = ProjectName.of(\"[PROJECT]\");
     for (XpnResourceId element : projectClient.getXpnResourcesProjects(project).iterateAll()) {
       // doThingsWith(element);
     }
   }

  project - Project ID for this request. - `com.google.cloud.compute.v1.ProjectName`

  returns: `com.google.cloud.compute.v1.ProjectClient$GetXpnResourcesProjectsPagedResponse`

  throws: com.google.api.gax.rpc.ApiException - if the remote call fails"
  (^com.google.cloud.compute.v1.ProjectClient$GetXpnResourcesProjectsPagedResponse [^ProjectClient this ^com.google.cloud.compute.v1.ProjectName project]
    (-> this (.getXpnResourcesProjects project))))

