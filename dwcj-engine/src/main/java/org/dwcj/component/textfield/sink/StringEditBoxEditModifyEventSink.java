package org.dwcj.component.textfield.sink;

import com.basis.bbj.proxies.event.BBjEditModifyEvent;
import com.basis.bbj.proxies.sysgui.BBjControl;
import org.dwcj.Environment;
import org.dwcj.bridge.ControlAccessor;
import org.dwcj.component.textfield.TextField;
import org.dwcj.component.textfield.event.StringEditBoxEditModifyEvent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class StringEditBoxEditModifyEventSink {
    
    private ArrayList<Consumer<StringEditBoxEditModifyEvent>> targets;
    private final TextField stringEditBox;


    @SuppressWarnings({"static-access"})
    public StringEditBoxEditModifyEventSink(TextField stringBox) {

        this.targets = new ArrayList<>();
        this.stringEditBox = stringBox;

        BBjControl bbjctrl = null;
        try {
            bbjctrl = ControlAccessor.getDefault().getBBjControl(stringBox);
            bbjctrl.setCallback(Environment.getInstance().getBBjAPI().ON_EDIT_MODIFY,
                    Environment.getInstance().getDwcjHelper().getEventProxy(this, "editModifyEvent"),
                    "onEvent");

        } catch (Exception e) {
            Environment.logError(e);
        }
    }


    public void editModifyEvent(BBjEditModifyEvent ev) { // NOSONAR
        StringEditBoxEditModifyEvent dwcEv = new StringEditBoxEditModifyEvent(this.stringEditBox);
        Iterator<Consumer<StringEditBoxEditModifyEvent>> it = targets.iterator();
        while (it.hasNext())
            it.next().accept(dwcEv);
    }

    public void addCallback(Consumer<StringEditBoxEditModifyEvent> callback) {
        targets.add(callback);
    }



}
