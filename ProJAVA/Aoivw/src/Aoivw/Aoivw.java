package Aoivw;

import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.internal.dialogs.ShowViewDialog;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.ArmListener;
import org.eclipse.swt.events.ArmEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.wb.swt.SWTResourceManager;

public class Aoivw {
	private Shell shlAoivw;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Aoivw window = new Aoivw();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		shlAoivw = new Shell();
		shlAoivw.setSize(702, 494);
		shlAoivw.setText("Aoivw");
		
		Menu menu = new Menu(shlAoivw, SWT.BAR);
		shlAoivw.setMenuBar(menu);
		
		MenuItem mntmNewSubmenu = new MenuItem(menu, SWT.CASCADE);
		mntmNewSubmenu.setText("File");
		
		Menu menu_1 = new Menu(mntmNewSubmenu);
		mntmNewSubmenu.setMenu(menu_1);
		
		MenuItem mntmNew = new MenuItem(menu_1, SWT.CASCADE);
		mntmNew.setText("New");
		
		Menu menu_21 = new Menu(mntmNew);
		mntmNew.setMenu(menu_21);
		
		MenuItem mntmSch_2 = new MenuItem(menu_21, SWT.NONE);
		mntmSch_2.setText("SCH");
		
		MenuItem mntmPcb_2 = new MenuItem(menu_21, SWT.NONE);
		mntmPcb_2.setText("PCB");
		
		MenuItem mntmSchLib_1 = new MenuItem(menu_21, SWT.NONE);
		mntmSchLib_1.setText("SCH Lib");
		
		MenuItem mntmPcbLib_1 = new MenuItem(menu_21, SWT.NONE);
		mntmPcbLib_1.setText("PCB Lib");
		
		MenuItem mntmdLib_1 = new MenuItem(menu_21, SWT.NONE);
		mntmdLib_1.setText("3D Lib");
		
		new MenuItem(menu_1, SWT.SEPARATOR);
		
		MenuItem mntmOpen = new MenuItem(menu_1, SWT.CASCADE);
		mntmOpen.setText("Open");
		
		Menu menu_20 = new Menu(mntmOpen);
		mntmOpen.setMenu(menu_20);
		
		MenuItem mntmSchFile = new MenuItem(menu_20, SWT.NONE);
		mntmSchFile.setText("SCH File");
		
		MenuItem mntmPcbFile = new MenuItem(menu_20, SWT.NONE);
		mntmPcbFile.setText("PCB File");
		
		MenuItem mntmGerberFile = new MenuItem(menu_20, SWT.NONE);
		mntmGerberFile.setText("Gerber File");
		
		new MenuItem(menu_1, SWT.SEPARATOR);
		
		MenuItem mntmSave = new MenuItem(menu_1, SWT.NONE);
		mntmSave.setText("Save");
		
		MenuItem mntmSaveAs = new MenuItem(menu_1, SWT.NONE);
		mntmSaveAs.setText("Save as");
		
		new MenuItem(menu_1, SWT.SEPARATOR);
		
		MenuItem mntmImport = new MenuItem(menu_1, SWT.CASCADE);
		mntmImport.setText("Import");
		
		Menu menu_13 = new Menu(mntmImport);
		mntmImport.setMenu(menu_13);
		
		MenuItem mntmAoivw = new MenuItem(menu_13, SWT.NONE);
		mntmAoivw.setText("Aoivw");
		
		MenuItem mntmDiptrace = new MenuItem(menu_13, SWT.NONE);
		mntmDiptrace.setText("DipTrace");
		
		MenuItem mntmKicad = new MenuItem(menu_13, SWT.NONE);
		mntmKicad.setText("KiCAD");
		
		MenuItem mntmAltium = new MenuItem(menu_13, SWT.NONE);
		mntmAltium.setText("Altium");
		
		MenuItem mntmOrcad = new MenuItem(menu_13, SWT.NONE);
		mntmOrcad.setText("OrCAD");
		
		MenuItem mntmCadence = new MenuItem(menu_13, SWT.NONE);
		mntmCadence.setText("Cadence");
		
		MenuItem mntmEagle = new MenuItem(menu_13, SWT.NONE);
		mntmEagle.setText("Eagle");
		
		MenuItem mntmProtel = new MenuItem(menu_13, SWT.NONE);
		mntmProtel.setText("Protel");
		
		MenuItem mntmSpecctra = new MenuItem(menu_13, SWT.NONE);
		mntmSpecctra.setText("Specctra");
		
		MenuItem mntmElectra = new MenuItem(menu_13, SWT.NONE);
		mntmElectra.setText("Electra");
		
		MenuItem mntmExport = new MenuItem(menu_1, SWT.CASCADE);
		mntmExport.setText("Export");
		
		Menu menu_14 = new Menu(mntmExport);
		mntmExport.setMenu(menu_14);
		
		MenuItem mntmAoivw_1 = new MenuItem(menu_14, SWT.NONE);
		mntmAoivw_1.setText("Aoivw");
		
		MenuItem mntmDiptrace_1 = new MenuItem(menu_14, SWT.NONE);
		mntmDiptrace_1.setText("DipTrace");
		
		MenuItem mntmKicad_1 = new MenuItem(menu_14, SWT.NONE);
		mntmKicad_1.setText("KiCAD");
		
		MenuItem mntmAltium_1 = new MenuItem(menu_14, SWT.NONE);
		mntmAltium_1.setText("Altium");
		
		MenuItem mntmOrcad_1 = new MenuItem(menu_14, SWT.NONE);
		mntmOrcad_1.setText("OrCAD");
		
		MenuItem mntmCadence_1 = new MenuItem(menu_14, SWT.NONE);
		mntmCadence_1.setText("Cadence");
		
		MenuItem mntmEagle_1 = new MenuItem(menu_14, SWT.NONE);
		mntmEagle_1.setText("Eagle");
		
		MenuItem mntmProtel_1 = new MenuItem(menu_14, SWT.NONE);
		mntmProtel_1.setText("Protel");
		
		MenuItem mntmSpecctra_1 = new MenuItem(menu_14, SWT.NONE);
		mntmSpecctra_1.setText("Specctra");
		
		MenuItem mntmElectra_1 = new MenuItem(menu_14, SWT.NONE);
		mntmElectra_1.setText("Electra");
		
		new MenuItem(menu_1, SWT.SEPARATOR);
		
		MenuItem mntmPrint = new MenuItem(menu_1, SWT.CASCADE);
		mntmPrint.setText("Print");
		
		Menu menu_11 = new Menu(mntmPrint);
		mntmPrint.setMenu(menu_11);
		
		MenuItem mntmPageSetup = new MenuItem(menu_11, SWT.NONE);
		mntmPageSetup.setText("Page Setup");
		
		MenuItem mntmPrint_1 = new MenuItem(menu_11, SWT.NONE);
		mntmPrint_1.setText("Print");
		
		new MenuItem(menu_1, SWT.SEPARATOR);
		
		MenuItem mntmExit = new MenuItem(menu_1, SWT.NONE);
		mntmExit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {System.exit(0);
			}
		});
		mntmExit.setText("Exit");
		
		MenuItem mntmEdit = new MenuItem(menu, SWT.CASCADE);
		mntmEdit.setText("Edit");
		
		Menu menu_2 = new Menu(mntmEdit);
		mntmEdit.setMenu(menu_2);
		
		MenuItem mntmZoom = new MenuItem(menu_2, SWT.NONE);
		mntmZoom.setText("Zoom+");
		
		MenuItem mntmZoom_1 = new MenuItem(menu_2, SWT.NONE);
		mntmZoom_1.setText("Zoom-");
		
		new MenuItem(menu_2, SWT.SEPARATOR);
		
		MenuItem mntmFind = new MenuItem(menu_2, SWT.NONE);
		mntmFind.setText("Find");
		
		new MenuItem(menu_2, SWT.SEPARATOR);
		
		MenuItem mntmSheetSetup = new MenuItem(menu_2, SWT.CASCADE);
		mntmSheetSetup.setText("Sheet Template");
		
		Menu menu_12 = new Menu(mntmSheetSetup);
		mntmSheetSetup.setMenu(menu_12);
		
		MenuItem mntmSch_1 = new MenuItem(menu_12, SWT.NONE);
		mntmSch_1.setText("SCH");
		
		MenuItem mntmPcb_1 = new MenuItem(menu_12, SWT.NONE);
		mntmPcb_1.setText("PCB");
		
		new MenuItem(menu_2, SWT.SEPARATOR);
		
		MenuItem mntmGrid = new MenuItem(menu_2, SWT.CASCADE);
		mntmGrid.setText("Grid");
		
		Menu menu_16 = new Menu(mntmGrid);
		mntmGrid.setMenu(menu_16);
		
		MenuItem mntmmil = new MenuItem(menu_16, SWT.NONE);
		mntmmil.setText("0.1mil");
		
		MenuItem mntmmil_1 = new MenuItem(menu_16, SWT.NONE);
		mntmmil_1.setText("0.2mil");
		
		MenuItem mntmmil_2 = new MenuItem(menu_16, SWT.NONE);
		mntmmil_2.setText("0.5mil");
		
		MenuItem mntmmil_3 = new MenuItem(menu_16, SWT.NONE);
		mntmmil_3.setText("1mil");
		
		MenuItem mntmmil_4 = new MenuItem(menu_16, SWT.NONE);
		mntmmil_4.setText("2mil");
		
		MenuItem mntmmil_5 = new MenuItem(menu_16, SWT.NONE);
		mntmmil_5.setText("5mil");
		
		MenuItem mntmmil_6 = new MenuItem(menu_16, SWT.NONE);
		mntmmil_6.setText("10mil");
		
		MenuItem mntmmil_7 = new MenuItem(menu_16, SWT.NONE);
		mntmmil_7.setText("20mil");
		
		new MenuItem(menu_2, SWT.SEPARATOR);
		
		MenuItem mntmDelete = new MenuItem(menu_2, SWT.NONE);
		mntmDelete.setText("Delete");
		
		MenuItem mntmSch = new MenuItem(menu, SWT.CASCADE);
		mntmSch.setText("SCH");
		
		Menu menu_3 = new Menu(mntmSch);
		mntmSch.setMenu(menu_3);
		
		MenuItem mntmComponent = new MenuItem(menu_3, SWT.NONE);
		mntmComponent.setText("Component");
		
		new MenuItem(menu_3, SWT.SEPARATOR);
		
		MenuItem mntmLine = new MenuItem(menu_3, SWT.NONE);
		mntmLine.setText("Line");
		
		MenuItem mntmArc = new MenuItem(menu_3, SWT.NONE);
		mntmArc.setText("Arc");
		
		MenuItem mntmRectangle = new MenuItem(menu_3, SWT.NONE);
		mntmRectangle.setText("Rectangle");
		
		MenuItem mntmText = new MenuItem(menu_3, SWT.NONE);
		mntmText.setText("Text");
		
		MenuItem mntmImage = new MenuItem(menu_3, SWT.NONE);
		mntmImage.setText("Image");
		
		new MenuItem(menu_3, SWT.SEPARATOR);
		
		MenuItem mntmConvertToPcb = new MenuItem(menu_3, SWT.NONE);
		mntmConvertToPcb.setText("Convert to PCB");
		
		new MenuItem(menu_3, SWT.SEPARATOR);
		
		MenuItem mntmSetting = new MenuItem(menu_3, SWT.CASCADE);
		mntmSetting.setText("Setting");
		
		Menu menu_15 = new Menu(mntmSetting);
		mntmSetting.setMenu(menu_15);
		
		MenuItem mntmDifferentialPair = new MenuItem(menu_15, SWT.NONE);
		mntmDifferentialPair.setText("Differential Pair");
		
		MenuItem mntmNetclasses = new MenuItem(menu_15, SWT.NONE);
		mntmNetclasses.setText("NetClasses");
		
		MenuItem mntmTrackWidth = new MenuItem(menu_15, SWT.NONE);
		mntmTrackWidth.setText("Track Width");
		
		MenuItem mntmErrorMatrix = new MenuItem(menu_15, SWT.NONE);
		mntmErrorMatrix.setText("Error Matrix");
		
		new MenuItem(menu_3, SWT.SEPARATOR);
		
		MenuItem mntmSimulator = new MenuItem(menu_3, SWT.NONE);
		mntmSimulator.setText("Simulator");
		
		MenuItem mntmPcb = new MenuItem(menu, SWT.CASCADE);
		mntmPcb.setText("PCB");
		
		Menu menu_4 = new Menu(mntmPcb);
		mntmPcb.setMenu(menu_4);
		
		MenuItem mntmUpdateFromSch = new MenuItem(menu_4, SWT.NONE);
		mntmUpdateFromSch.setText("Update by Schematic");
		
		new MenuItem(menu_4, SWT.SEPARATOR);
		
		MenuItem mntmAutoPlace = new MenuItem(menu_4, SWT.NONE);
		mntmAutoPlace.setText("Auto Place");
		
		new MenuItem(menu_4, SWT.SEPARATOR);
		
		MenuItem mntmAutoRouter = new MenuItem(menu_4, SWT.NONE);
		mntmAutoRouter.setText("Auto Router");
		
		new MenuItem(menu_4, SWT.SEPARATOR);
		
		MenuItem mntmSingleTrack = new MenuItem(menu_4, SWT.NONE);
		mntmSingleTrack.setText("Single Track");
		
		MenuItem mntmArc_1 = new MenuItem(menu_4, SWT.NONE);
		mntmArc_1.setText("Arc");
		
		MenuItem mntmRectangle_1 = new MenuItem(menu_4, SWT.NONE);
		mntmRectangle_1.setText("Rectangle");
		
		MenuItem mntmText_1 = new MenuItem(menu_4, SWT.NONE);
		mntmText_1.setText("Text");
		
		MenuItem mntmImage_1 = new MenuItem(menu_4, SWT.NONE);
		mntmImage_1.setText("Image");
		
		new MenuItem(menu_4, SWT.SEPARATOR);
		
		MenuItem mntmBoardOutline = new MenuItem(menu_4, SWT.NONE);
		mntmBoardOutline.setText("Board Outline");
		
		new MenuItem(menu_4, SWT.SEPARATOR);
		
		MenuItem mntmOutputToGerber = new MenuItem(menu_4, SWT.NONE);
		mntmOutputToGerber.setText("Output to Gerber");
		
		new MenuItem(menu_4, SWT.SEPARATOR);
		
		MenuItem mntmDifferentialPair_1 = new MenuItem(menu_4, SWT.CASCADE);
		mntmDifferentialPair_1.setText("Differential Pair");
		
		Menu menu_17 = new Menu(mntmDifferentialPair_1);
		mntmDifferentialPair_1.setMenu(menu_17);
		
		MenuItem mntmSingleTrack_1 = new MenuItem(menu_17, SWT.NONE);
		mntmSingleTrack_1.setText("Single Track");
		
		MenuItem mntmNewItem = new MenuItem(menu_17, SWT.NONE);
		mntmNewItem.setText("Two Track");
		
		new MenuItem(menu_4, SWT.SEPARATOR);
		
		MenuItem mntmMeaderTool = new MenuItem(menu_4, SWT.CASCADE);
		mntmMeaderTool.setText("Meander Tool");
		
		Menu menu_18 = new Menu(mntmMeaderTool);
		mntmMeaderTool.setMenu(menu_18);
		
		MenuItem mntmSingleTrack_2 = new MenuItem(menu_18, SWT.NONE);
		mntmSingleTrack_2.setText("Single Track");
		
		MenuItem mntmTypeSelection = new MenuItem(menu_18, SWT.NONE);
		mntmTypeSelection.setText("Type Selection");
		
		new MenuItem(menu_4, SWT.SEPARATOR);
		
		MenuItem mntmSetting_1 = new MenuItem(menu_4, SWT.CASCADE);
		mntmSetting_1.setText("Setting");
		
		Menu menu_19 = new Menu(mntmSetting_1);
		mntmSetting_1.setMenu(menu_19);
		
		MenuItem mntmDifferentialPair_2 = new MenuItem(menu_19, SWT.NONE);
		mntmDifferentialPair_2.setText("Differential Pair");
		
		MenuItem mntmTrackWidth_1 = new MenuItem(menu_19, SWT.NONE);
		mntmTrackWidth_1.setText("Track Width");
		
		MenuItem mntmVia = new MenuItem(menu_19, SWT.NONE);
		mntmVia.setText("Via");
		
		MenuItem mntmLayer = new MenuItem(menu_19, SWT.NONE);
		mntmLayer.setText("Layer");
		
		MenuItem mntmNetclasses_1 = new MenuItem(menu_19, SWT.NONE);
		mntmNetclasses_1.setText("NetClasses");
		
		MenuItem mntmSchLib = new MenuItem(menu, SWT.CASCADE);
		mntmSchLib.setText("SCH Lib");
		
		Menu menu_5 = new Menu(mntmSchLib);
		mntmSchLib.setMenu(menu_5);
		
		MenuItem mntmPlaceComponent = new MenuItem(menu_5, SWT.NONE);
		mntmPlaceComponent.setText("Place Component");
		
		MenuItem mntmAddComponent = new MenuItem(menu_5, SWT.NONE);
		mntmAddComponent.setText("Add Component");
		
		MenuItem mntmPcbLib = new MenuItem(menu, SWT.CASCADE);
		mntmPcbLib.setText("PCB Lib");
		
		Menu menu_6 = new Menu(mntmPcbLib);
		mntmPcbLib.setMenu(menu_6);
		
		MenuItem mntmPlaceComponent_1 = new MenuItem(menu_6, SWT.NONE);
		mntmPlaceComponent_1.setText("Place Component");
		
		MenuItem mntmAddComponent_1 = new MenuItem(menu_6, SWT.NONE);
		mntmAddComponent_1.setText("Add Component");
		
		MenuItem mntmdLib = new MenuItem(menu, SWT.CASCADE);
		mntmdLib.setText("3D Lib");
		
		Menu menu_7 = new Menu(mntmdLib);
		mntmdLib.setMenu(menu_7);
		
		MenuItem mntmShowComponent = new MenuItem(menu_7, SWT.NONE);
		mntmShowComponent.setText("Show Component");
		
		MenuItem mntmAddComponent_2 = new MenuItem(menu_7, SWT.NONE);
		mntmAddComponent_2.setText("Add Component");
		
		MenuItem mntmNgspiceLib = new MenuItem(menu, SWT.CASCADE);
		mntmNgspiceLib.setText("NgSpice Lib");
		
		Menu menu_22 = new Menu(mntmNgspiceLib);
		mntmNgspiceLib.setMenu(menu_22);
		
		MenuItem mntmPlaceComponent_2 = new MenuItem(menu_22, SWT.NONE);
		mntmPlaceComponent_2.setText("Place Component");
		
		MenuItem mntmAddComponent_3 = new MenuItem(menu_22, SWT.NONE);
		mntmAddComponent_3.setText("Add Component");
		
		MenuItem mntmGerberview = new MenuItem(menu, SWT.CASCADE);
		mntmGerberview.setText("Gerber");
		
		Menu menu_8 = new Menu(mntmGerberview);
		mntmGerberview.setMenu(menu_8);
		
		MenuItem mntmOutputToRx = new MenuItem(menu_8, SWT.NONE);
		mntmOutputToRx.setText("Output to RX-274");
		
		MenuItem mntmCalculator = new MenuItem(menu, SWT.CASCADE);
		mntmCalculator.setText("Calculator");
		
		Menu menu_9 = new Menu(mntmCalculator);
		mntmCalculator.setMenu(menu_9);
		
		MenuItem mntmPcalculator = new MenuItem(menu_9, SWT.NONE);
		mntmPcalculator.setText("P-Calculator");
		
		MenuItem mntmBitmapToLib = new MenuItem(menu, SWT.CASCADE);
		mntmBitmapToLib.setText("Bitmap to Lib");
		
		Menu menu_23 = new Menu(mntmBitmapToLib);
		mntmBitmapToLib.setMenu(menu_23);
		
		MenuItem mntmBitmapToSch = new MenuItem(menu_23, SWT.NONE);
		mntmBitmapToSch.setText("Bitmap to SCH Lib");
		
		MenuItem mntmBitmapToPcb = new MenuItem(menu_23, SWT.NONE);
		mntmBitmapToPcb.setText("Bitmap to PCB Lib");
		
		MenuItem mntmHelp = new MenuItem(menu, SWT.CASCADE);
		mntmHelp.setText("Help");
		
		Menu menu_10 = new Menu(mntmHelp);
		mntmHelp.setMenu(menu_10);
		
		MenuItem mntmHandbook = new MenuItem(menu_10, SWT.NONE);
		mntmHandbook.setText("Handbook");
		
		MenuItem mntmAbout = new MenuItem(menu_10, SWT.NONE);
		mntmAbout.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				new About(shlAoivw, SWT.PRIMARY_MODAL).open();
			}
		});
		mntmAbout.setText("About");

		shlAoivw.open();
		shlAoivw.layout();
		while (!shlAoivw.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
