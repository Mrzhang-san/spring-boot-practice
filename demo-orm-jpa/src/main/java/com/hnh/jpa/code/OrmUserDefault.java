//调试表原始对象
{
  "title" : "调试：com.intellij.database.psi.DbTableImpl",
  "methodList" : [ {
    "name" : "isSystem",
    "desc" : "public boolean com.intellij.database.psi.DbTableImpl.isSystem()",
    "value" : "false"
  }, {
    "name" : "isTemporary",
    "desc" : "public boolean com.intellij.database.psi.DbTableImpl.isTemporary()",
    "value" : "false"
  }, {
    "name" : "getDocumentation",
    "desc" : "public java.lang.StringBuilder com.intellij.database.psi.DbTableImpl.getDocumentation(boolean)",
    "value" : null
  }, {
    "name" : "getDocumentation",
    "desc" : "public java.lang.CharSequence com.intellij.database.psi.DbTableImpl.getDocumentation(boolean)",
    "value" : null
  }, {
    "name" : "getColumnAttrs",
    "desc" : "public java.util.Set<com.intellij.database.model.DasColumn$Attribute> com.intellij.database.psi.DbTableImpl.getColumnAttrs(com.intellij.database.model.DasColumn)",
    "value" : null
  }, {
    "name" : "getName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getName(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getName()",
    "value" : "orm_user"
  }, {
    "name" : "getTypeName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getTypeName()",
    "value" : "table"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.psi.PsiFileSystemItem com.intellij.database.psi.DbElementImpl.getParent()",
    "value" : "hnhe_123: schema"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.database.psi.DbElement com.intellij.database.psi.DbElementImpl.getParent()",
    "value" : "hnhe_123: schema"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getParent()",
    "value" : "hnhe_123: schema"
  }, {
    "name" : "init",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.init(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "setName",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.setName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getLanguage",
    "desc" : "public com.intellij.lang.Language com.intellij.database.psi.DbElementImpl.getLanguage()",
    "value" : "Language: SQL"
  }, {
    "name" : "isDirectory",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isDirectory()",
    "value" : "false"
  }, {
    "name" : "isWritable",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isWritable()",
    "value" : "true"
  }, {
    "name" : "getComment",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getComment()",
    "value" : "Spring Boot Demo Orm 系列示例表"
  }, {
    "name" : "isValid",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isValid()",
    "value" : "true"
  }, {
    "name" : "getPosition",
    "desc" : "public short com.intellij.database.psi.DbElementImpl.getPosition()",
    "value" : "0"
  }, {
    "name" : "isCaseSensitive",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isCaseSensitive()",
    "value" : "false"
  }, {
    "name" : "getManager",
    "desc" : "public com.intellij.psi.PsiManager com.intellij.database.psi.DbElementImpl.getManager()",
    "value" : "{UNBOUNDED_WILDCARD=PsiType:?}"
  }, {
    "name" : "getChildren",
    "desc" : "public com.intellij.psi.PsiElement[] com.intellij.database.psi.DbElementImpl.getChildren()",
    "value" : "[Lcom.intellij.psi.PsiElement;@1a26941a"
  }, {
    "name" : "getText",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getText()",
    "value" : "create table orm_user\n(\n    id               int auto_increment comment '主键'\n        primary key,\n    name             varchar(32)                        not null comment '用户名',\n    password         varchar(32)                        not null comment '加密后的密码',\n    salt             varchar(32)                        not null comment '加密使用的盐',\n    email            varchar(32)                        not null comment '邮箱',\n    phone_number     varchar(15)                        not null comment '手机号码',\n    status           int(2)   default 1                 not null comment '状态，-1：逻辑删除，0：禁用，1：启用',\n    create_time      datetime default CURRENT_TIMESTAMP not null comment '创建时间',\n    last_login_time  datetime                           null comment '上次登录时间',\n    last_update_time datetime default CURRENT_TIMESTAMP not null comment '上次更新时间',\n    constraint email\n        unique (email),\n    constraint name\n        unique (name),\n    constraint phone_number\n        unique (phone_number)\n)\n    comment 'Spring Boot Demo Orm 系列示例表';\n\n"
  }, {
    "name" : "getDelegate",
    "desc" : "public D com.intellij.database.psi.DbElementImpl.getDelegate()",
    "value" : "orm_user: table"
  }, {
    "name" : "getDeclaration",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getDeclaration()",
    "value" : "orm_user: table"
  }, {
    "name" : "getWeight",
    "desc" : "public int com.intellij.database.psi.DbElementImpl.getWeight()",
    "value" : "10000"
  }, {
    "name" : "getIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon(boolean)",
    "value" : null
  }, {
    "name" : "getIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon()",
    "value" : "Deferred. Base=RasterizedImageDataLoader(, classLoader=PluginClassLoader(plugin=PluginDescriptor(name=Database Tools and SQL, id=com.intellij.database, descriptorPath=plugin.xml, path=D:\\IntelliJ IDEA 2021.2.2\\plugins\\DatabaseTools, version=212.5284.40, package=null), packagePrefix=null, instanceId=126, state=active), path='icons/table.svg')"
  }, {
    "name" : "canNavigateToSource",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.canNavigateToSource()",
    "value" : null
  }, {
    "name" : "getDbms",
    "desc" : "public com.intellij.database.Dbms com.intellij.database.psi.DbElementImpl.getDbms()",
    "value" : "MYSQL"
  }, {
    "name" : "getDasParent",
    "desc" : "public com.intellij.database.model.DasObject com.intellij.database.psi.DbElementImpl.getDasParent()",
    "value" : "hnhe_123: schema"
  }, {
    "name" : "getDasParent",
    "desc" : "public P com.intellij.database.psi.DbElementImpl.getDasParent()",
    "value" : "hnhe_123: schema"
  }, {
    "name" : "getLocationString",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getLocationString()",
    "value" : "hnhe_123 [120]"
  }, {
    "name" : "getVirtualFile",
    "desc" : "public com.intellij.openapi.vfs.VirtualFile com.intellij.database.psi.DbElementImpl.getVirtualFile()",
    "value" : "DB VirtualFile: table, hnhe_123.orm_user (DDL) [120] (Valid)"
  }, {
    "name" : "getKind",
    "desc" : "public com.intellij.database.model.ObjectKind com.intellij.database.psi.DbElementImpl.getKind()",
    "value" : "table"
  }, {
    "name" : "isQuoted",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isQuoted()",
    "value" : "true"
  }, {
    "name" : "getDasChildren",
    "desc" : "public com.intellij.util.containers.JBIterable<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.getDasChildren(com.intellij.database.model.ObjectKind)",
    "value" : null
  }, {
    "name" : "acceptChildren",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.acceptChildren(com.intellij.psi.PsiElementVisitor)",
    "value" : null
  }, {
    "name" : "processDeclarations",
    "desc" : "public final boolean com.intellij.database.psi.DbElementImpl.processDeclarations(com.intellij.database.model.DasScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getProject",
    "desc" : "public com.intellij.openapi.project.Project com.intellij.database.psi.DbElementImpl.getProject()",
    "value" : "Project(name=spring-boot-practice, containerState=COMPONENT_CREATED, componentStore=E:\\IDEA_WORKSPACE\\spring-boot-practice)"
  }, {
    "name" : "processChildren",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.processChildren(com.intellij.psi.search.PsiElementProcessor<? super com.intellij.psi.PsiFileSystemItem>)",
    "value" : null
  }, {
    "name" : "checkSetName",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.checkSetName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "navigate",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.navigate(boolean)",
    "value" : null
  }, {
    "name" : "canNavigate",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.canNavigate()",
    "value" : null
  }, {
    "name" : "getMetaData",
    "desc" : "public com.intellij.psi.meta.PsiMetaData com.intellij.database.psi.DbElementImpl.getMetaData()",
    "value" : "orm_user: table"
  }, {
    "name" : "getDataSource",
    "desc" : "public com.intellij.database.psi.DbDataSource com.intellij.database.psi.DbElementImpl.getDataSource()",
    "value" : "120: root"
  }, {
    "name" : "getDataSource",
    "desc" : "public com.intellij.database.psi.DbDataSourceImpl com.intellij.database.psi.DbElementImpl.getDataSource()",
    "value" : "120: root"
  }, {
    "name" : "getBaseIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getBaseIcon()",
    "value" : "RasterizedImageDataLoader(, classLoader=PluginClassLoader(plugin=PluginDescriptor(name=Database Tools and SQL, id=com.intellij.database, descriptorPath=plugin.xml, path=D:\\IntelliJ IDEA 2021.2.2\\plugins\\DatabaseTools, version=212.5284.40, package=null), packagePrefix=null, instanceId=126, state=active), path='icons/table.svg')"
  }, {
    "name" : "createDeclarationProcessor",
    "desc" : "public com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.createDeclarationProcessor(com.intellij.database.model.DasScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "newDeclarationProcessor",
    "desc" : "public static com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.newDeclarationProcessor(com.intellij.database.model.DasScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getNode",
    "desc" : "public com.intellij.lang.ASTNode com.intellij.psi.impl.FakePsiElement.getNode()",
    "value" : null
  }, {
    "name" : "getTextLength",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getTextLength()",
    "value" : "0"
  }, {
    "name" : "getIcon",
    "desc" : "public final javax.swing.Icon com.intellij.psi.impl.FakePsiElement.getIcon(int)",
    "value" : null
  }, {
    "name" : "getPresentation",
    "desc" : "public com.intellij.navigation.ItemPresentation com.intellij.psi.impl.FakePsiElement.getPresentation()",
    "value" : "orm_user: table"
  }, {
    "name" : "getTextOffset",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getTextOffset()",
    "value" : "0"
  }, {
    "name" : "findElementAt",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.findElementAt(int)",
    "value" : null
  }, {
    "name" : "getPrevSibling",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getPrevSibling()",
    "value" : null
  }, {
    "name" : "getLastChild",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getLastChild()",
    "value" : null
  }, {
    "name" : "textContains",
    "desc" : "public boolean com.intellij.psi.impl.FakePsiElement.textContains(char)",
    "value" : null
  }, {
    "name" : "isPhysical",
    "desc" : "public boolean com.intellij.psi.impl.FakePsiElement.isPhysical()",
    "value" : "false"
  }, {
    "name" : "getTextRange",
    "desc" : "public com.intellij.openapi.util.TextRange com.intellij.psi.impl.FakePsiElement.getTextRange()",
    "value" : null
  }, {
    "name" : "textToCharArray",
    "desc" : "public char[] com.intellij.psi.impl.FakePsiElement.textToCharArray()",
    "value" : null
  }, {
    "name" : "getStartOffsetInParent",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getStartOffsetInParent()",
    "value" : "0"
  }, {
    "name" : "getFirstChild",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getFirstChild()",
    "value" : null
  }, {
    "name" : "getNextSibling",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getNextSibling()",
    "value" : null
  }, {
    "name" : "getPresentableText",
    "desc" : "public java.lang.String com.intellij.psi.impl.FakePsiElement.getPresentableText()",
    "value" : "orm_user"
  }, {
    "name" : "add",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.add(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "replace",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.replace(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "checkDelete",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.checkDelete() throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "delete",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.delete() throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "accept",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.accept(com.intellij.psi.PsiElementVisitor)",
    "value" : null
  }, {
    "name" : "getContext",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getContext()",
    "value" : "hnhe_123: schema"
  }, {
    "name" : "copy",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.copy()",
    "value" : null
  }, {
    "name" : "addRange",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addBefore",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addAfter",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getNavigationElement",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getNavigationElement()",
    "value" : "orm_user: table"
  }, {
    "name" : "getContainingFile",
    "desc" : "public com.intellij.psi.PsiFile com.intellij.psi.impl.PsiElementBase.getContainingFile()",
    "value" : null
  }, {
    "name" : "getOriginalElement",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getOriginalElement()",
    "value" : "orm_user: table"
  }, {
    "name" : "getResolveScope",
    "desc" : "public com.intellij.psi.search.GlobalSearchScope com.intellij.psi.impl.PsiElementBase.getResolveScope()",
    "value" : "Project and Libraries"
  }, {
    "name" : "isEquivalentTo",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.isEquivalentTo(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getReferences",
    "desc" : "public com.intellij.psi.PsiReference[] com.intellij.psi.impl.PsiElementBase.getReferences()",
    "value" : "[Lcom.intellij.psi.PsiReference;@16f13ad0"
  }, {
    "name" : "addRangeBefore",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "deleteChildRange",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.deleteChildRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getUseScope",
    "desc" : "public com.intellij.psi.search.SearchScope com.intellij.psi.impl.PsiElementBase.getUseScope()",
    "value" : "Project and Libraries"
  }, {
    "name" : "findReferenceAt",
    "desc" : "public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.findReferenceAt(int)",
    "value" : null
  }, {
    "name" : "textMatches",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.textMatches(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "textMatches",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.textMatches(java.lang.CharSequence)",
    "value" : null
  }, {
    "name" : "checkAdd",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.checkAdd(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addRangeAfter",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getReference",
    "desc" : "public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.getReference()",
    "value" : null
  }, {
    "name" : "processDeclarations",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.processDeclarations(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "iconWithVisibilityIfNeeded",
    "desc" : "public static javax.swing.Icon com.intellij.psi.impl.ElementBase.iconWithVisibilityIfNeeded(int,javax.swing.Icon,javax.swing.Icon)",
    "value" : null
  }, {
    "name" : "buildRowIcon",
    "desc" : "public static com.intellij.ui.icons.RowIcon com.intellij.psi.impl.ElementBase.buildRowIcon(javax.swing.Icon,javax.swing.Icon)",
    "value" : null
  }, {
    "name" : "isNativeFileType",
    "desc" : "public static boolean com.intellij.psi.impl.ElementBase.isNativeFileType(com.intellij.openapi.fileTypes.FileType)",
    "value" : null
  }, {
    "name" : "transformFlags",
    "desc" : "public static int com.intellij.psi.impl.ElementBase.transformFlags(com.intellij.psi.PsiElement,int)",
    "value" : null
  }, {
    "name" : "replace",
    "desc" : "public <T> boolean com.intellij.openapi.util.UserDataHolderBase.replace(com.intellij.openapi.util.Key<T>,T,T)",
    "value" : null
  }, {
    "name" : "getUserData",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.getUserData(com.intellij.openapi.util.Key<T>)",
    "value" : null
  }, {
    "name" : "putUserData",
    "desc" : "public <T> void com.intellij.openapi.util.UserDataHolderBase.putUserData(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "isUserDataEmpty",
    "desc" : "public boolean com.intellij.openapi.util.UserDataHolderBase.isUserDataEmpty()",
    "value" : "false"
  }, {
    "name" : "copyCopyableDataTo",
    "desc" : "public void com.intellij.openapi.util.UserDataHolderBase.copyCopyableDataTo(com.intellij.openapi.util.UserDataHolderBase)",
    "value" : null
  }, {
    "name" : "getUserDataString",
    "desc" : "public java.lang.String com.intellij.openapi.util.UserDataHolderBase.getUserDataString()",
    "value" : "{COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@ba55454, CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@6d2825b9}"
  }, {
    "name" : "copyUserDataTo",
    "desc" : "public void com.intellij.openapi.util.UserDataHolderBase.copyUserDataTo(com.intellij.openapi.util.UserDataHolderBase)",
    "value" : null
  }, {
    "name" : "getCopyableUserData",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.getCopyableUserData(com.intellij.openapi.util.Key<T>)",
    "value" : null
  }, {
    "name" : "putCopyableUserData",
    "desc" : "public <T> void com.intellij.openapi.util.UserDataHolderBase.putCopyableUserData(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "putUserDataIfAbsent",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.putUserDataIfAbsent(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "get",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.get()",
    "value" : "{COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@ba55454, CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@6d2825b9}"
  }, {
    "name" : "set",
    "desc" : "public final void java.util.concurrent.atomic.AtomicReference.set(V)",
    "value" : null
  }, {
    "name" : "getOpaque",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.getOpaque()",
    "value" : "{COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@ba55454, CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@6d2825b9}"
  }, {
    "name" : "setOpaque",
    "desc" : "public final void java.util.concurrent.atomic.AtomicReference.setOpaque(V)",
    "value" : null
  }, {
    "name" : "getAcquire",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.getAcquire()",
    "value" : "{COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@ba55454, CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@6d2825b9}"
  }, {
    "name" : "setRelease",
    "desc" : "public final void java.util.concurrent.atomic.AtomicReference.setRelease(V)",
    "value" : null
  }, {
    "name" : "compareAndSet",
    "desc" : "public final boolean java.util.concurrent.atomic.AtomicReference.compareAndSet(V,V)",
    "value" : null
  }, {
    "name" : "compareAndExchange",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.compareAndExchange(V,V)",
    "value" : null
  }, {
    "name" : "compareAndExchangeAcquire",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.compareAndExchangeAcquire(V,V)",
    "value" : null
  }, {
    "name" : "compareAndExchangeRelease",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.compareAndExchangeRelease(V,V)",
    "value" : null
  }, {
    "name" : "weakCompareAndSetPlain",
    "desc" : "public final boolean java.util.concurrent.atomic.AtomicReference.weakCompareAndSetPlain(V,V)",
    "value" : null
  }, {
    "name" : "weakCompareAndSet",
    "desc" : "public final boolean java.util.concurrent.atomic.AtomicReference.weakCompareAndSet(V,V)",
    "value" : null
  }, {
    "name" : "weakCompareAndSetAcquire",
    "desc" : "public final boolean java.util.concurrent.atomic.AtomicReference.weakCompareAndSetAcquire(V,V)",
    "value" : null
  }, {
    "name" : "weakCompareAndSetRelease",
    "desc" : "public final boolean java.util.concurrent.atomic.AtomicReference.weakCompareAndSetRelease(V,V)",
    "value" : null
  }, {
    "name" : "getAndSet",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.getAndSet(V)",
    "value" : null
  }, {
    "name" : "lazySet",
    "desc" : "public final void java.util.concurrent.atomic.AtomicReference.lazySet(V)",
    "value" : null
  }, {
    "name" : "getAndUpdate",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.getAndUpdate(java.util.function.UnaryOperator<V>)",
    "value" : null
  }, {
    "name" : "updateAndGet",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.updateAndGet(java.util.function.UnaryOperator<V>)",
    "value" : null
  }, {
    "name" : "getAndAccumulate",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.getAndAccumulate(V,java.util.function.BinaryOperator<V>)",
    "value" : null
  }, {
    "name" : "accumulateAndGet",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.accumulateAndGet(V,java.util.function.BinaryOperator<V>)",
    "value" : null
  }, {
    "name" : "getPlain",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.getPlain()",
    "value" : "{COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@ba55454, CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@6d2825b9}"
  }, {
    "name" : "setPlain",
    "desc" : "public final void java.util.concurrent.atomic.AtomicReference.setPlain(V)",
    "value" : null
  }, {
    "name" : "weakCompareAndSetVolatile",
    "desc" : "public final boolean java.util.concurrent.atomic.AtomicReference.weakCompareAndSetVolatile(V,V)",
    "value" : null
  }, {
    "name" : "getOwnReferences",
    "desc" : "public default java.util.Collection<? extends com.intellij.model.psi.PsiSymbolReference> com.intellij.psi.PsiElement.getOwnReferences()",
    "value" : "[]"
  }, {
    "name" : "getOwnDeclarations",
    "desc" : "public default java.util.Collection<? extends com.intellij.model.psi.PsiSymbolDeclaration> com.intellij.psi.PsiElement.getOwnDeclarations()",
    "value" : "[]"
  }, {
    "name" : "getTextRangeInParent",
    "desc" : "public default com.intellij.openapi.util.TextRange com.intellij.psi.PsiElement.getTextRangeInParent()",
    "value" : "(0,0)"
  }, {
    "name" : "getDbParent",
    "desc" : "public default com.intellij.database.model.DasObject com.intellij.database.model.DasObject.getDbParent()",
    "value" : "hnhe_123: schema"
  }, {
    "name" : "getDbChildren",
    "desc" : "public default <C> com.intellij.util.containers.JBIterable<C> com.intellij.database.model.DasObject.getDbChildren(java.lang.Class<C>,com.intellij.database.model.ObjectKind)",
    "value" : null
  }, {
    "name" : "getDependencies",
    "desc" : "public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependencies()",
    "value" : "[Ljava.lang.Object;@4f66c59e"
  }, {
    "name" : "getDependences",
    "desc" : "public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependences()",
    "value" : "[Ljava.lang.Object;@4f66c59e"
  }, {
    "name" : "getContextElement",
    "desc" : "public default com.intellij.psi.PsiElement com.intellij.database.symbols.DasPsiSymbol.getContextElement()",
    "value" : "orm_user: table"
  }, {
    "name" : "getPsiDeclarations",
    "desc" : "public default com.intellij.util.containers.JBIterable<com.intellij.psi.PsiElement> com.intellij.database.symbols.DasPsiSymbol.getPsiDeclarations()",
    "value" : "orm_user: table"
  }, {
    "name" : "getDasObject",
    "desc" : "public default com.intellij.database.model.DasObject com.intellij.database.psi.DbTable.getDasObject()",
    "value" : "orm_user: table"
  }, {
    "name" : "getDasObject",
    "desc" : "public default com.intellij.database.model.DasTable com.intellij.database.psi.DbTable.getDasObject()",
    "value" : "orm_user: table"
  } ],
  "----" : "-----------------我是一条华丽的分割线-----------------",
  "fieldList" : [ {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@481711b6"
  }, {
    "name" : "WEIGHT_BASE",
    "type" : "int",
    "value" : "10000"
  }, {
    "name" : "WEIGHT_INC",
    "type" : "int",
    "value" : "1000"
  }, {
    "name" : "myParent",
    "type" : "com.intellij.database.psi.DbElement",
    "value" : "hnhe_123: schema"
  }, {
    "name" : "myDelegate",
    "type" : "java.lang.Object",
    "value" : "orm_user: table"
  }, {
    "name" : "myTransactionalVersion",
    "type" : "long",
    "value" : "23"
  }, {
    "name" : "ASYNC_DOC_CUT",
    "type" : "java.lang.String",
    "value" : "<!-- async-doc-cut -->"
  }, {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@3124771f"
  }, {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@21509f3e"
  }, {
    "name" : "FLAGS_LOCKED",
    "type" : "int",
    "value" : "2048"
  }, {
    "name" : "ICON_COMPUTE",
    "type" : "java.util.function.Function",
    "value" : "com.intellij.psi.impl.ElementBase$$Lambda$1332/0x0000000101217440@3bdafea4"
  }, {
    "name" : "VISIBILITY_ICON_PLACEHOLDER",
    "type" : "com.intellij.openapi.util.NotNullLazyValue",
    "value" : "com.intellij.openapi.util.NotNullLazyValue$1@4b30c2c8"
  }, {
    "name" : "COPYABLE_USER_MAP_KEY",
    "type" : "com.intellij.openapi.util.Key",
    "value" : "COPYABLE_USER_MAP_KEY"
  }, {
    "name" : "serialVersionUID",
    "type" : "long",
    "value" : "-1848883965231344442"
  }, {
    "name" : "VALUE",
    "type" : "java.lang.invoke.VarHandle",
    "value" : "java.lang.invoke.VarHandleObjects$FieldInstanceReadWrite@593ed83e"
  }, {
    "name" : "value",
    "type" : "java.lang.Object",
    "value" : "{COLOR_KEY=com.intellij.database.view.DatabaseColorManager$CachedColor@ba55454, CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@6d2825b9}"
  } ]
}

//调试列原始对象
{
  "title" : "调试：com.intellij.database.psi.DbColumnImpl",
  "methodList" : [ {
    "name" : "getDefault",
    "desc" : "public java.lang.String com.intellij.database.psi.DbColumnImpl.getDefault()",
    "value" : null
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.database.psi.DbElement com.intellij.database.psi.DbColumnImpl.getParent()",
    "value" : "orm_user: table"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbColumnImpl.getParent()",
    "value" : "orm_user: table"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.database.psi.DbTable com.intellij.database.psi.DbColumnImpl.getParent()",
    "value" : "orm_user: table"
  }, {
    "name" : "getParent",
    "desc" : "public com.intellij.psi.PsiFileSystemItem com.intellij.database.psi.DbColumnImpl.getParent()",
    "value" : "orm_user: table"
  }, {
    "name" : "getTable",
    "desc" : "public com.intellij.database.psi.DbTable com.intellij.database.psi.DbColumnImpl.getTable()",
    "value" : "orm_user: table"
  }, {
    "name" : "getTable",
    "desc" : "public com.intellij.database.model.DasTable com.intellij.database.psi.DbColumnImpl.getTable()",
    "value" : "orm_user: table"
  }, {
    "name" : "getDataType",
    "desc" : "public com.intellij.database.model.DataType com.intellij.database.psi.DbColumnImpl.getDataType()",
    "value" : "int(11)"
  }, {
    "name" : "getWeight",
    "desc" : "public int com.intellij.database.psi.DbColumnImpl.getWeight()",
    "value" : "10030"
  }, {
    "name" : "getDocumentation",
    "desc" : "public java.lang.StringBuilder com.intellij.database.psi.DbColumnImpl.getDocumentation(boolean)",
    "value" : null
  }, {
    "name" : "getDocumentation",
    "desc" : "public java.lang.CharSequence com.intellij.database.psi.DbColumnImpl.getDocumentation(boolean)",
    "value" : null
  }, {
    "name" : "isNotNull",
    "desc" : "public boolean com.intellij.database.psi.DbColumnImpl.isNotNull()",
    "value" : "true"
  }, {
    "name" : "getName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getName(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getName()",
    "value" : "id"
  }, {
    "name" : "getTypeName",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getTypeName()",
    "value" : "column"
  }, {
    "name" : "init",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.init(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "setName",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.setName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getLanguage",
    "desc" : "public com.intellij.lang.Language com.intellij.database.psi.DbElementImpl.getLanguage()",
    "value" : "Language: SQL"
  }, {
    "name" : "isDirectory",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isDirectory()",
    "value" : "false"
  }, {
    "name" : "isWritable",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isWritable()",
    "value" : "true"
  }, {
    "name" : "getComment",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getComment()",
    "value" : "主键"
  }, {
    "name" : "isValid",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isValid()",
    "value" : "true"
  }, {
    "name" : "getPosition",
    "desc" : "public short com.intellij.database.psi.DbElementImpl.getPosition()",
    "value" : "1"
  }, {
    "name" : "isCaseSensitive",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isCaseSensitive()",
    "value" : "false"
  }, {
    "name" : "getManager",
    "desc" : "public com.intellij.psi.PsiManager com.intellij.database.psi.DbElementImpl.getManager()",
    "value" : "{UNBOUNDED_WILDCARD=PsiType:?}"
  }, {
    "name" : "getChildren",
    "desc" : "public com.intellij.psi.PsiElement[] com.intellij.database.psi.DbElementImpl.getChildren()",
    "value" : "[Lcom.intellij.psi.PsiElement;@1a26941a"
  }, {
    "name" : "getText",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getText()",
    "value" : "alter table orm_user\n    add id int auto_increment comment '主键';\n\n"
  }, {
    "name" : "getDelegate",
    "desc" : "public D com.intellij.database.psi.DbElementImpl.getDelegate()",
    "value" : "id: column"
  }, {
    "name" : "getDeclaration",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.database.psi.DbElementImpl.getDeclaration()",
    "value" : "alter table orm_user\n    add id int auto_increment comment '主键';\n\n: column"
  }, {
    "name" : "getIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon(boolean)",
    "value" : null
  }, {
    "name" : "getIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getIcon()",
    "value" : "Deferred. Base=RasterizedImageDataLoader(, classLoader=PluginClassLoader(plugin=PluginDescriptor(name=Database Tools and SQL, id=com.intellij.database, descriptorPath=plugin.xml, path=D:\\IntelliJ IDEA 2021.2.2\\plugins\\DatabaseTools, version=212.5284.40, package=null), packagePrefix=null, instanceId=126, state=active), path='icons/col.svg')"
  }, {
    "name" : "canNavigateToSource",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.canNavigateToSource()",
    "value" : null
  }, {
    "name" : "getDbms",
    "desc" : "public com.intellij.database.Dbms com.intellij.database.psi.DbElementImpl.getDbms()",
    "value" : "MYSQL"
  }, {
    "name" : "getDasParent",
    "desc" : "public com.intellij.database.model.DasObject com.intellij.database.psi.DbElementImpl.getDasParent()",
    "value" : "orm_user: table"
  }, {
    "name" : "getDasParent",
    "desc" : "public P com.intellij.database.psi.DbElementImpl.getDasParent()",
    "value" : "orm_user: table"
  }, {
    "name" : "getLocationString",
    "desc" : "public java.lang.String com.intellij.database.psi.DbElementImpl.getLocationString()",
    "value" : "hnhe_123.orm_user [120]"
  }, {
    "name" : "getVirtualFile",
    "desc" : "public com.intellij.openapi.vfs.VirtualFile com.intellij.database.psi.DbElementImpl.getVirtualFile()",
    "value" : "DB VirtualFile: column, hnhe_123.orm_user.id (DDL) [120] (Valid)"
  }, {
    "name" : "getKind",
    "desc" : "public com.intellij.database.model.ObjectKind com.intellij.database.psi.DbElementImpl.getKind()",
    "value" : "column"
  }, {
    "name" : "isQuoted",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.isQuoted()",
    "value" : "true"
  }, {
    "name" : "getDasChildren",
    "desc" : "public com.intellij.util.containers.JBIterable<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.getDasChildren(com.intellij.database.model.ObjectKind)",
    "value" : null
  }, {
    "name" : "acceptChildren",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.acceptChildren(com.intellij.psi.PsiElementVisitor)",
    "value" : null
  }, {
    "name" : "processDeclarations",
    "desc" : "public final boolean com.intellij.database.psi.DbElementImpl.processDeclarations(com.intellij.database.model.DasScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getProject",
    "desc" : "public com.intellij.openapi.project.Project com.intellij.database.psi.DbElementImpl.getProject()",
    "value" : "Project(name=spring-boot-practice, containerState=COMPONENT_CREATED, componentStore=E:\\IDEA_WORKSPACE\\spring-boot-practice)"
  }, {
    "name" : "processChildren",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.processChildren(com.intellij.psi.search.PsiElementProcessor<? super com.intellij.psi.PsiFileSystemItem>)",
    "value" : null
  }, {
    "name" : "checkSetName",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.checkSetName(java.lang.String) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "navigate",
    "desc" : "public void com.intellij.database.psi.DbElementImpl.navigate(boolean)",
    "value" : null
  }, {
    "name" : "canNavigate",
    "desc" : "public boolean com.intellij.database.psi.DbElementImpl.canNavigate()",
    "value" : null
  }, {
    "name" : "getMetaData",
    "desc" : "public com.intellij.psi.meta.PsiMetaData com.intellij.database.psi.DbElementImpl.getMetaData()",
    "value" : "alter table orm_user\n    add id int auto_increment comment '主键';\n\n: column"
  }, {
    "name" : "getDataSource",
    "desc" : "public com.intellij.database.psi.DbDataSource com.intellij.database.psi.DbElementImpl.getDataSource()",
    "value" : "120: root"
  }, {
    "name" : "getDataSource",
    "desc" : "public com.intellij.database.psi.DbDataSourceImpl com.intellij.database.psi.DbElementImpl.getDataSource()",
    "value" : "120: root"
  }, {
    "name" : "getBaseIcon",
    "desc" : "public javax.swing.Icon com.intellij.database.psi.DbElementImpl.getBaseIcon()",
    "value" : "RasterizedImageDataLoader(, classLoader=PluginClassLoader(plugin=PluginDescriptor(name=Database Tools and SQL, id=com.intellij.database, descriptorPath=plugin.xml, path=D:\\IntelliJ IDEA 2021.2.2\\plugins\\DatabaseTools, version=212.5284.40, package=null), packagePrefix=null, instanceId=126, state=active), path='icons/col.svg')"
  }, {
    "name" : "createDeclarationProcessor",
    "desc" : "public com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.createDeclarationProcessor(com.intellij.database.model.DasScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "newDeclarationProcessor",
    "desc" : "public static com.intellij.util.Processor<com.intellij.database.psi.DbElement> com.intellij.database.psi.DbElementImpl.newDeclarationProcessor(com.intellij.database.model.DasScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getNode",
    "desc" : "public com.intellij.lang.ASTNode com.intellij.psi.impl.FakePsiElement.getNode()",
    "value" : null
  }, {
    "name" : "getTextLength",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getTextLength()",
    "value" : "0"
  }, {
    "name" : "getIcon",
    "desc" : "public final javax.swing.Icon com.intellij.psi.impl.FakePsiElement.getIcon(int)",
    "value" : null
  }, {
    "name" : "getPresentation",
    "desc" : "public com.intellij.navigation.ItemPresentation com.intellij.psi.impl.FakePsiElement.getPresentation()",
    "value" : "alter table orm_user\n    add id int auto_increment comment '主键';\n\n: column"
  }, {
    "name" : "getTextOffset",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getTextOffset()",
    "value" : "0"
  }, {
    "name" : "findElementAt",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.findElementAt(int)",
    "value" : null
  }, {
    "name" : "getPrevSibling",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getPrevSibling()",
    "value" : null
  }, {
    "name" : "getLastChild",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getLastChild()",
    "value" : null
  }, {
    "name" : "textContains",
    "desc" : "public boolean com.intellij.psi.impl.FakePsiElement.textContains(char)",
    "value" : null
  }, {
    "name" : "isPhysical",
    "desc" : "public boolean com.intellij.psi.impl.FakePsiElement.isPhysical()",
    "value" : "false"
  }, {
    "name" : "getTextRange",
    "desc" : "public com.intellij.openapi.util.TextRange com.intellij.psi.impl.FakePsiElement.getTextRange()",
    "value" : null
  }, {
    "name" : "textToCharArray",
    "desc" : "public char[] com.intellij.psi.impl.FakePsiElement.textToCharArray()",
    "value" : null
  }, {
    "name" : "getStartOffsetInParent",
    "desc" : "public int com.intellij.psi.impl.FakePsiElement.getStartOffsetInParent()",
    "value" : "0"
  }, {
    "name" : "getFirstChild",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getFirstChild()",
    "value" : null
  }, {
    "name" : "getNextSibling",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.FakePsiElement.getNextSibling()",
    "value" : null
  }, {
    "name" : "getPresentableText",
    "desc" : "public java.lang.String com.intellij.psi.impl.FakePsiElement.getPresentableText()",
    "value" : "id"
  }, {
    "name" : "add",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.add(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "replace",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.replace(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "checkDelete",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.checkDelete() throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "delete",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.delete() throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "accept",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.accept(com.intellij.psi.PsiElementVisitor)",
    "value" : null
  }, {
    "name" : "getContext",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getContext()",
    "value" : "orm_user: table"
  }, {
    "name" : "copy",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.copy()",
    "value" : null
  }, {
    "name" : "addRange",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addBefore",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addAfter",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getNavigationElement",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getNavigationElement()",
    "value" : "alter table orm_user\n    add id int auto_increment comment '主键';\n\n: column"
  }, {
    "name" : "getContainingFile",
    "desc" : "public com.intellij.psi.PsiFile com.intellij.psi.impl.PsiElementBase.getContainingFile()",
    "value" : null
  }, {
    "name" : "getOriginalElement",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.getOriginalElement()",
    "value" : "alter table orm_user\n    add id int auto_increment comment '主键';\n\n: column"
  }, {
    "name" : "getResolveScope",
    "desc" : "public com.intellij.psi.search.GlobalSearchScope com.intellij.psi.impl.PsiElementBase.getResolveScope()",
    "value" : "Project and Libraries"
  }, {
    "name" : "isEquivalentTo",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.isEquivalentTo(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "getReferences",
    "desc" : "public com.intellij.psi.PsiReference[] com.intellij.psi.impl.PsiElementBase.getReferences()",
    "value" : "[Lcom.intellij.psi.PsiReference;@16f13ad0"
  }, {
    "name" : "addRangeBefore",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeBefore(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "deleteChildRange",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.deleteChildRange(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getUseScope",
    "desc" : "public com.intellij.psi.search.SearchScope com.intellij.psi.impl.PsiElementBase.getUseScope()",
    "value" : "Project and Libraries"
  }, {
    "name" : "findReferenceAt",
    "desc" : "public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.findReferenceAt(int)",
    "value" : null
  }, {
    "name" : "textMatches",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.textMatches(com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "textMatches",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.textMatches(java.lang.CharSequence)",
    "value" : null
  }, {
    "name" : "checkAdd",
    "desc" : "public void com.intellij.psi.impl.PsiElementBase.checkAdd(com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "addRangeAfter",
    "desc" : "public com.intellij.psi.PsiElement com.intellij.psi.impl.PsiElementBase.addRangeAfter(com.intellij.psi.PsiElement,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement) throws com.intellij.util.IncorrectOperationException",
    "value" : null
  }, {
    "name" : "getReference",
    "desc" : "public com.intellij.psi.PsiReference com.intellij.psi.impl.PsiElementBase.getReference()",
    "value" : null
  }, {
    "name" : "processDeclarations",
    "desc" : "public boolean com.intellij.psi.impl.PsiElementBase.processDeclarations(com.intellij.psi.scope.PsiScopeProcessor,com.intellij.psi.ResolveState,com.intellij.psi.PsiElement,com.intellij.psi.PsiElement)",
    "value" : null
  }, {
    "name" : "iconWithVisibilityIfNeeded",
    "desc" : "public static javax.swing.Icon com.intellij.psi.impl.ElementBase.iconWithVisibilityIfNeeded(int,javax.swing.Icon,javax.swing.Icon)",
    "value" : null
  }, {
    "name" : "buildRowIcon",
    "desc" : "public static com.intellij.ui.icons.RowIcon com.intellij.psi.impl.ElementBase.buildRowIcon(javax.swing.Icon,javax.swing.Icon)",
    "value" : null
  }, {
    "name" : "isNativeFileType",
    "desc" : "public static boolean com.intellij.psi.impl.ElementBase.isNativeFileType(com.intellij.openapi.fileTypes.FileType)",
    "value" : null
  }, {
    "name" : "transformFlags",
    "desc" : "public static int com.intellij.psi.impl.ElementBase.transformFlags(com.intellij.psi.PsiElement,int)",
    "value" : null
  }, {
    "name" : "replace",
    "desc" : "public <T> boolean com.intellij.openapi.util.UserDataHolderBase.replace(com.intellij.openapi.util.Key<T>,T,T)",
    "value" : null
  }, {
    "name" : "getUserData",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.getUserData(com.intellij.openapi.util.Key<T>)",
    "value" : null
  }, {
    "name" : "putUserData",
    "desc" : "public <T> void com.intellij.openapi.util.UserDataHolderBase.putUserData(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "isUserDataEmpty",
    "desc" : "public boolean com.intellij.openapi.util.UserDataHolderBase.isUserDataEmpty()",
    "value" : "false"
  }, {
    "name" : "copyCopyableDataTo",
    "desc" : "public void com.intellij.openapi.util.UserDataHolderBase.copyCopyableDataTo(com.intellij.openapi.util.UserDataHolderBase)",
    "value" : null
  }, {
    "name" : "getUserDataString",
    "desc" : "public java.lang.String com.intellij.openapi.util.UserDataHolderBase.getUserDataString()",
    "value" : "{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@5a6dc56}"
  }, {
    "name" : "copyUserDataTo",
    "desc" : "public void com.intellij.openapi.util.UserDataHolderBase.copyUserDataTo(com.intellij.openapi.util.UserDataHolderBase)",
    "value" : null
  }, {
    "name" : "getCopyableUserData",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.getCopyableUserData(com.intellij.openapi.util.Key<T>)",
    "value" : null
  }, {
    "name" : "putCopyableUserData",
    "desc" : "public <T> void com.intellij.openapi.util.UserDataHolderBase.putCopyableUserData(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "putUserDataIfAbsent",
    "desc" : "public <T> T com.intellij.openapi.util.UserDataHolderBase.putUserDataIfAbsent(com.intellij.openapi.util.Key<T>,T)",
    "value" : null
  }, {
    "name" : "get",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.get()",
    "value" : "{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@5a6dc56}"
  }, {
    "name" : "set",
    "desc" : "public final void java.util.concurrent.atomic.AtomicReference.set(V)",
    "value" : null
  }, {
    "name" : "getOpaque",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.getOpaque()",
    "value" : "{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@5a6dc56}"
  }, {
    "name" : "setOpaque",
    "desc" : "public final void java.util.concurrent.atomic.AtomicReference.setOpaque(V)",
    "value" : null
  }, {
    "name" : "getAcquire",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.getAcquire()",
    "value" : "{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@5a6dc56}"
  }, {
    "name" : "setRelease",
    "desc" : "public final void java.util.concurrent.atomic.AtomicReference.setRelease(V)",
    "value" : null
  }, {
    "name" : "compareAndSet",
    "desc" : "public final boolean java.util.concurrent.atomic.AtomicReference.compareAndSet(V,V)",
    "value" : null
  }, {
    "name" : "compareAndExchange",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.compareAndExchange(V,V)",
    "value" : null
  }, {
    "name" : "compareAndExchangeAcquire",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.compareAndExchangeAcquire(V,V)",
    "value" : null
  }, {
    "name" : "compareAndExchangeRelease",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.compareAndExchangeRelease(V,V)",
    "value" : null
  }, {
    "name" : "weakCompareAndSetPlain",
    "desc" : "public final boolean java.util.concurrent.atomic.AtomicReference.weakCompareAndSetPlain(V,V)",
    "value" : null
  }, {
    "name" : "weakCompareAndSet",
    "desc" : "public final boolean java.util.concurrent.atomic.AtomicReference.weakCompareAndSet(V,V)",
    "value" : null
  }, {
    "name" : "weakCompareAndSetAcquire",
    "desc" : "public final boolean java.util.concurrent.atomic.AtomicReference.weakCompareAndSetAcquire(V,V)",
    "value" : null
  }, {
    "name" : "weakCompareAndSetRelease",
    "desc" : "public final boolean java.util.concurrent.atomic.AtomicReference.weakCompareAndSetRelease(V,V)",
    "value" : null
  }, {
    "name" : "getAndSet",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.getAndSet(V)",
    "value" : null
  }, {
    "name" : "lazySet",
    "desc" : "public final void java.util.concurrent.atomic.AtomicReference.lazySet(V)",
    "value" : null
  }, {
    "name" : "getAndUpdate",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.getAndUpdate(java.util.function.UnaryOperator<V>)",
    "value" : null
  }, {
    "name" : "updateAndGet",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.updateAndGet(java.util.function.UnaryOperator<V>)",
    "value" : null
  }, {
    "name" : "getAndAccumulate",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.getAndAccumulate(V,java.util.function.BinaryOperator<V>)",
    "value" : null
  }, {
    "name" : "accumulateAndGet",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.accumulateAndGet(V,java.util.function.BinaryOperator<V>)",
    "value" : null
  }, {
    "name" : "getPlain",
    "desc" : "public final V java.util.concurrent.atomic.AtomicReference.getPlain()",
    "value" : "{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@5a6dc56}"
  }, {
    "name" : "setPlain",
    "desc" : "public final void java.util.concurrent.atomic.AtomicReference.setPlain(V)",
    "value" : null
  }, {
    "name" : "weakCompareAndSetVolatile",
    "desc" : "public final boolean java.util.concurrent.atomic.AtomicReference.weakCompareAndSetVolatile(V,V)",
    "value" : null
  }, {
    "name" : "getOwnReferences",
    "desc" : "public default java.util.Collection<? extends com.intellij.model.psi.PsiSymbolReference> com.intellij.psi.PsiElement.getOwnReferences()",
    "value" : "[]"
  }, {
    "name" : "getOwnDeclarations",
    "desc" : "public default java.util.Collection<? extends com.intellij.model.psi.PsiSymbolDeclaration> com.intellij.psi.PsiElement.getOwnDeclarations()",
    "value" : "[]"
  }, {
    "name" : "getTextRangeInParent",
    "desc" : "public default com.intellij.openapi.util.TextRange com.intellij.psi.PsiElement.getTextRangeInParent()",
    "value" : "(0,0)"
  }, {
    "name" : "getDbParent",
    "desc" : "public default com.intellij.database.model.DasObject com.intellij.database.model.DasObject.getDbParent()",
    "value" : "orm_user: table"
  }, {
    "name" : "getDbChildren",
    "desc" : "public default <C> com.intellij.util.containers.JBIterable<C> com.intellij.database.model.DasObject.getDbChildren(java.lang.Class<C>,com.intellij.database.model.ObjectKind)",
    "value" : null
  }, {
    "name" : "getDependencies",
    "desc" : "public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependencies()",
    "value" : "[Ljava.lang.Object;@4f66c59e"
  }, {
    "name" : "getDependences",
    "desc" : "public default java.lang.Object[] com.intellij.psi.meta.PsiMetaData.getDependences()",
    "value" : "[Ljava.lang.Object;@4f66c59e"
  }, {
    "name" : "getContextElement",
    "desc" : "public default com.intellij.psi.PsiElement com.intellij.database.symbols.DasPsiSymbol.getContextElement()",
    "value" : "alter table orm_user\n    add id int auto_increment comment '主键';\n\n: column"
  }, {
    "name" : "getPsiDeclarations",
    "desc" : "public default com.intellij.util.containers.JBIterable<com.intellij.psi.PsiElement> com.intellij.database.symbols.DasPsiSymbol.getPsiDeclarations()",
    "value" : "alter table orm_user\n    add id int auto_increment comment '主键';\n\n: column"
  }, {
    "name" : "getDasObject",
    "desc" : "public default com.intellij.database.model.DasObject com.intellij.database.psi.DbColumn.getDasObject()",
    "value" : "alter table orm_user\n    add id int auto_increment comment '主键';\n\n: column"
  }, {
    "name" : "getDasObject",
    "desc" : "public default com.intellij.database.model.DasColumn com.intellij.database.psi.DbColumn.getDasObject()",
    "value" : "alter table orm_user\n    add id int auto_increment comment '主键';\n\n: column"
  }, {
    "name" : "getTableName",
    "desc" : "public default java.lang.String com.intellij.database.model.DasColumn.getTableName()",
    "value" : "orm_user"
  } ],
  "----" : "-----------------我是一条华丽的分割线-----------------",
  "fieldList" : [ {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@481711b6"
  }, {
    "name" : "WEIGHT_BASE",
    "type" : "int",
    "value" : "10000"
  }, {
    "name" : "WEIGHT_INC",
    "type" : "int",
    "value" : "1000"
  }, {
    "name" : "myParent",
    "type" : "com.intellij.database.psi.DbElement",
    "value" : "orm_user: table"
  }, {
    "name" : "myDelegate",
    "type" : "java.lang.Object",
    "value" : "id: column"
  }, {
    "name" : "myTransactionalVersion",
    "type" : "long",
    "value" : "23"
  }, {
    "name" : "ASYNC_DOC_CUT",
    "type" : "java.lang.String",
    "value" : "<!-- async-doc-cut -->"
  }, {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@3124771f"
  }, {
    "name" : "LOG",
    "type" : "com.intellij.openapi.diagnostic.Logger",
    "value" : "com.intellij.idea.IdeaLogger@21509f3e"
  }, {
    "name" : "FLAGS_LOCKED",
    "type" : "int",
    "value" : "2048"
  }, {
    "name" : "ICON_COMPUTE",
    "type" : "java.util.function.Function",
    "value" : "com.intellij.psi.impl.ElementBase$$Lambda$1332/0x0000000101217440@3bdafea4"
  }, {
    "name" : "VISIBILITY_ICON_PLACEHOLDER",
    "type" : "com.intellij.openapi.util.NotNullLazyValue",
    "value" : "com.intellij.openapi.util.NotNullLazyValue$1@4b30c2c8"
  }, {
    "name" : "COPYABLE_USER_MAP_KEY",
    "type" : "com.intellij.openapi.util.Key",
    "value" : "COPYABLE_USER_MAP_KEY"
  }, {
    "name" : "serialVersionUID",
    "type" : "long",
    "value" : "-1848883965231344442"
  }, {
    "name" : "VALUE",
    "type" : "java.lang.invoke.VarHandle",
    "value" : "java.lang.invoke.VarHandleObjects$FieldInstanceReadWrite@593ed83e"
  }, {
    "name" : "value",
    "type" : "java.lang.Object",
    "value" : "{CACHED_SMART_POINTER_KEY=com.intellij.reference.SoftReference@5a6dc56}"
  } ]
}

//调试列原始列类型
{
  "title" : "调试：com.intellij.database.model.DataType",
  "methodList" : [ {
    "name" : "getLength",
    "desc" : "public int com.intellij.database.model.DataType.getLength()",
    "value" : "11"
  }, {
    "name" : "getScale",
    "desc" : "public int com.intellij.database.model.DataType.getScale()",
    "value" : "0"
  }, {
    "name" : "getSpecification",
    "desc" : "public java.lang.String com.intellij.database.model.DataType.getSpecification(boolean,boolean)",
    "value" : null
  }, {
    "name" : "getSpecification",
    "desc" : "public java.lang.String com.intellij.database.model.DataType.getSpecification()",
    "value" : "int(11)"
  }, {
    "name" : "getSpecification",
    "desc" : "public java.lang.String com.intellij.database.model.DataType.getSpecification(boolean,boolean,boolean)",
    "value" : null
  }, {
    "name" : "getPrecision",
    "desc" : "public int com.intellij.database.model.DataType.getPrecision()",
    "value" : "11"
  }, {
    "name" : "withTypeName",
    "desc" : "public com.intellij.database.model.DataType com.intellij.database.model.DataType.withTypeName(java.lang.String)",
    "value" : null
  }, {
    "name" : "withSuffix",
    "desc" : "public com.intellij.database.model.DataType com.intellij.database.model.DataType.withSuffix(java.lang.String)",
    "value" : null
  }, {
    "name" : "equalsWithoutJdbc",
    "desc" : "public boolean com.intellij.database.model.DataType.equalsWithoutJdbc(com.intellij.database.model.DataType)",
    "value" : null
  } ],
  "----" : "-----------------我是一条华丽的分割线-----------------",
  "fieldList" : [ {
    "name" : "MAX_SIZE",
    "type" : "int",
    "value" : "2147483647"
  }, {
    "name" : "STAR_SIZE",
    "type" : "int",
    "value" : "2147483646"
  }, {
    "name" : "NO_SIZE",
    "type" : "int",
    "value" : "-1"
  }, {
    "name" : "NO_SCALE",
    "type" : "int",
    "value" : "0"
  }, {
    "name" : "UNKNOWN",
    "type" : "com.intellij.database.model.DataType",
    "value" : "unknown"
  }, {
    "name" : "schemaName",
    "type" : "java.lang.String",
    "value" : null
  }, {
    "name" : "packageName",
    "type" : "java.lang.String",
    "value" : null
  }, {
    "name" : "typeName",
    "type" : "java.lang.String",
    "value" : "int"
  }, {
    "name" : "size",
    "type" : "int",
    "value" : "11"
  }, {
    "name" : "scale",
    "type" : "int",
    "value" : "0"
  }, {
    "name" : "sizeUnit",
    "type" : "com.intellij.database.model.LengthUnit",
    "value" : "com.intellij.database.model.LengthUnit@5eb76c11"
  }, {
    "name" : "vagueArg",
    "type" : "java.lang.String",
    "value" : null
  }, {
    "name" : "suffix",
    "type" : "java.lang.String",
    "value" : null
  }, {
    "name" : "sizeUnitExplicit",
    "type" : "boolean",
    "value" : "false"
  }, {
    "name" : "custom",
    "type" : "boolean",
    "value" : "false"
  }, {
    "name" : "enumValues",
    "type" : "java.util.List",
    "value" : null
  }, {
    "name" : "jdbcType",
    "type" : "int",
    "value" : "0"
  } ]
}

//获取原始列类型中的字段
sqlType = int

//执行原始列类型中的方法
sqlTypeLen = 11