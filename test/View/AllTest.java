package View;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import Controller.CollisionCheckerTest;
import Controller.KeyhandlerTest;
import Controller.TileManagerTest;
import Controller.TileTest;
import Entity.EntityTest;
import Entity.PlayerTest;
import Main.MainTest;
import Model.AssetSetterTest;
import Model.Door_ObjectTest;
import Model.OBJ_KeyTest;
import Model.SuperObjectTest;
import Model.Terre_objectTest;



@RunWith(Suite.class)
@SuiteClasses({ PlayerTest.class, AssetSetterTest.class, Door_ObjectTest.class, OBJ_KeyTest.class, SuperObjectTest.class,
	Terre_objectTest.class, ViewFrameTest.class, CollisionCheckerTest.class, KeyhandlerTest.class, EntityTest.class, TileTest.class, TileManagerTest.class, MainTest.class })

public class AllTest {

}
